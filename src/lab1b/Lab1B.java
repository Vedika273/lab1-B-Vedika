package lab1b;

/**
 * test for Lab 01 Part B
 * Shows GradedActivity, FinalExam, PassFailExam, Essay, and CourseGrade.
 * 
 * @author Vedika
 */
public class Lab1B {

    public static void main(String[] args) {
        

        // === Step 2 test : FinalExam ===
        System.out.println("=== Step 2: FinalExam Demo ===");
        FinalExam finalExam = new FinalExam(100, 25); // 50 questions, missed 5
        System.out.println("How many questions on the exam? " + finalExam.getNumQuestions());
        System.out.println("How many questions did the student miss? " + finalExam.getNumMissed());
        System.out.println("Each questions counts " + finalExam.getPointsEach() + " points");
        System.out.println("The exam score is  " + finalExam.getScore());
        System.out.println("The exam grade is " + finalExam.getGrade() + "\n");

        // === Step 3: PassFailExam test ===
        System.out.println("=== Step 3: PassFailExam Demo ===");
        PassFailExam pfExam = new PassFailExam(100, 25, 60); // 100 questions, missed 25
        System.out.println("How many questions are on the exam? " + pfExam.getNumQuestions());
        System.out.println("How many questions did the student miss? " + pfExam.getNumMissed());
        System.out.println("What is the minimum passing score ? " + pfExam.getminPassingScore());
        System.out.println("Each questions counts " + pfExam.getPointsEach() + " points");
        System.out.println("The exam score is " + pfExam.getScore());
        System.out.println("The exam grade is " + pfExam.GetGrade() + "\n");

        // === Step 4: Essay test ===
        System.out.println("=== Step 4: Essay Demo ===");
        Essay essay = new Essay();
        essay.setScore(25, 18, 20, 25); // grammar, spelling, length, content
        System.out.println("Term Paper :");
        System.out.println("Grammar: " + essay.getGrammar());
        System.out.println("Spelling: " + essay.getSpelling());
        System.out.println("Length: " + essay.getCorrectLength());
        System.out.println("Content: " + essay.getContent());
        System.out.println("Total score: " + essay.getScore());
        System.out.println("Essay grade: " + essay.getGrade() + "\n");

        

        //Step 5 : CourseGrades with Analyzable
        
        System.out.println("=== Step 5 : CourseGrades Demo ===");
        
        //lab activity 
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);
        
        //Pass/fail exam : 10 questions, missed 2, pass mark = 70
        PassFailExam phyExam = new PassFailExam(10,2,70);
        
        //Essay : grammar , spelling, length, content 
        Essay essay2 = new Essay();
        essay2.setScore(25,15,20,20);  //total = 80
        
        //Final Exam : 50 questions missed 5 of them 
        FinalExam finalExam2 = new FinalExam(100,20);
        
        CourseGrade course2 = new CourseGrade();
        course2.setLab(lab);
        course2.setPassFailExam(phyExam);
        course2.setEssay(essay2);
        course2.setFinalExam(finalExam2);
        
        //print results for each component 
        System.out.println(course2.toString());
        
        
        
        
        //Step 6 DEMO
        
        System.out.println("== Step 6 : CourseGrade");
        
        //lab Activity
        GradedActivity lab2 = new GradedActivity();
        lab2.setScore(85);
        
        //Pass/Fail Exam
        PassFailExam newExam = new PassFailExam(10,2,70);
        
        //Essay 
        Essay newEssay = new Essay();
        essay.setScore(25,15,20,20);  //= 80 total 
        
        //final Exam
        FinalExam finalExam3 = new FinalExam(100,20); 
        
        CourseGrade course = new CourseGrade();
        course.setLab(lab2);
        course.setPassFailExam(newExam);
        course.setEssay(newEssay);
        course.setFinalExam(finalExam3);
        
        System.out.println("Average score: " + course.getAverage());
        System.out.println("Highest score: " + course.getHighest().getScore());
        System.out.println("Lowest score: " + course.getLowest().getScore());
        
    }
}