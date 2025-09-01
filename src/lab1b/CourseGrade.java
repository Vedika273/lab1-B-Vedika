//https://github.com/Vedika273/lab1-B-Vedika

package lab1b;

/**
 * CourseGrade stores all graded activities for a course:
 * Lab, Pass/Fail Exam, Essay, and Final Exam.
 * Implements Analyzable to provide average, highest, and lowest.
 * 
 * @author Vedika
 */
public class CourseGrade implements Analyzable{
    private GradedActivity[] grades; 
    private final int NUM_GRADES = 4; 
    
    
    public CourseGrade() {
        grades = new GradedActivity[NUM_GRADES];
    }
    public void setLab(GradedActivity lab) {
        grades[0] = lab; 
    }
    
    public void setPassFailExam(PassFailExam exam) {
        grades[1] = exam;
    }
    
    public void setEssay(Essay essay) {
        grades[2] = essay; 
    }
    
    public void setFinalExam(FinalExam exam) {
        grades[3] = exam;
    }
    
    @Override
    public String toString() {
        String result = "";
        String[] labels = {"Lab", "Pass/Fail Exam", "Essay", "Final Exam"};

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != null) {
                result += labels[i]
                        + ": Score : " + grades[i].getScore()
                        + ", Grade :" + grades[i].getGrade()
                        + "\n";
            }
        }
    return result;
    }


    @Override
    public double getAverage() {
        double total = 0; 
        int count  = 0; 
        
        for (GradedActivity g : grades) {
            if (g != null ) {
                total += g.getScore();
                count++;
            }
        }
        return (count == 0) ? 0 : total / count; 
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity highest = null;
        
        for (GradedActivity g : grades) {
           if (g != null) {
               if (highest == null || g.getScore() > highest.getScore())
                   highest = g;
           } 
        }
        return highest;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity lowest = null;
        
        for (GradedActivity g : grades) {
            if (g != null) {
                if (lowest == null || g.getScore() < lowest.getScore()){
                    lowest = g;
                }
            }
        }
        return lowest; 
    }
    
}
