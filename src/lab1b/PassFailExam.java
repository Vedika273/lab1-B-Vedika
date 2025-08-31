/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 *
 * @author Vedika
 */
public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach; 
    private int numMissed; 
    
    
    public PassFailExam(int questions , int missed ) {
        
    }
    
    public double getPointsEach() {
        return pointsEach;
    }
    
    public int getNumMissed() {
        return numMissed;
    }
    
}
