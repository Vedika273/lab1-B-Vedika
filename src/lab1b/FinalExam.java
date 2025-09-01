
 //https://github.com/Vedika273/lab1-B-Vedika

package lab1b;

/**
 * FinalExam is a graded activity that calculates score
 * based on number of questions and how many were missed.
 * @author Vedika
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    
    //constrcutor
    public FinalExam(int questions, int missed) {
        
        this.numQuestions = questions; 
        this.numMissed = missed; 
        
         pointsEach = 100.0 /questions; 
         double numericScore = 100.0 - (numMissed * pointsEach);
         
         //set the score as the new score calculated (numericScore
         setScore(numericScore);
         
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    } 
    
    public int getNumQuestions() {
        return numQuestions; 
    }
   
}


