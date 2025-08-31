/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 *
 * @author Vedika
 */
public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    private double numericScore;
    
    
    //constrcutor
    public FinalExam(int questions, int missed) {
         pointsEach = 100.0 /questions; 
         setScore(100.0 - (missed * pointsEach));
         
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    } 
    
    
}


