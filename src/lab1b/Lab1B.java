package lab1b;

/**
 * Demo program for Lab 01 Part B
 * Shows GradedActivity, FinalExam, PassFailExam, Essay, and CourseGrade.
 * 
 * @author Vedika
 */
public class Lab1B {

    public static void main(String[] args) {
        // === Step 1: GradedActivity ===
        System.out.println("=== Step 1: GradedActivity Demo ===");
        GradedActivity activity = new GradedActivity();
        activity.setScore(85); // example score
        System.out.println("Score: " + activity.getScore());
        System.out.println("Grade: " + activity.getGrade() + "\n");

        // === Step 2: FinalExam ===
        System.out.println("=== Step 2: FinalExam Demo ===");
        FinalExam finalExam = new FinalExam(100, 25); // 50 questions, missed 5
        System.out.println("How many questions on the exam? " + finalExam.getNumQuestions());
        System.out.println("How many questions did the student miss? " + finalExam.getNumMissed());
        System.out.println("Each questions counts " + finalExam.getPointsEach() + " points");
        System.out.println("The exam score is  " + finalExam.getScore());
        System.out.println("The exam grade is " + finalExam.getGrade() + "\n");

        // === Step 3: PassFailExam ===
        System.out.println("=== Step 3: PassFailExam Demo ===");
        PassFailExam pfExam = new PassFailExam(100, 25, 60); // 100 questions, missed 25
        System.out.println("How many questions are on the exam? " + pfExam.getNumQuestions());
        System.out.println("How many questions did the student miss? " + pfExam.getNumMissed());
        System.out.println("What is the minimum passing score ? " + pfExam.getminPassingScore());
        System.out.println("Each questions counts " + pfExam.getPointsEach() + " points");
        System.out.println("The exam score is " + pfExam.getScore());
        System.out.println("The exam grade is " + pfExam.GetGrade() + "\n");

        // === Step 4: Essay ===
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

        // === Step 5 & 6: CourseGrades with Analyzable ===
        System.out.println("=== Step 5 & 6: CourseGrades Demo ===");
        CourseGrade course = new CourseGrade();
        course.setLab(activity);
        course.setPassFailExam(pfExam);
        course.setEssay(essay);
        course.setFinalExam(finalExam);

        System.out.println(course.toString());

        System.out.println("Average Score: " + course.getAverage());
        System.out.println("Highest Score: " + course.getHighest().getScore() +
                           " (" + course.getHighest().getGrade() + ")");
        System.out.println("Lowest Score: " + course.getLowest().getScore() +
                           " (" + course.getLowest().getGrade() + ")");
    }
}


