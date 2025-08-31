/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 * A PassFailExam is a Pass/Fail graded exam.
 * It calculates a numeric score based on questions missed,
 * then assigns 'P' or 'F' depending on minPassingScore.
 * 
 * @author Vedika
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach; 
    private int numMissed; 
    
    //constrcutor
    public PassFailExam(int questions , int missed, double minPassingScore ) {
        
        super(minPassingScore);   //passing the minPassingScore to the constructor of PassFailActivity (superclass)
        
        if (questions <= 0) {
            System.out.println("the number of questions must be more than 0");
        }
        if (missed < 0 || missed > questions ) {
            System.out.println("number of missed questions must be between 0 and questions");
            
        }
        if (minPassingScore < 0.0 || minPassingScore > 100.0) {
            System.out.println("minPassingScore must be between 0 and 100");
        }
       
        this.numQuestions = questions; 
        this.numMissed = missed; 
        
        pointsEach = 100.0 / numQuestions; 
        double numericScore = 100.0 - (numMissed * pointsEach);
        
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
