/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 *
 * @author Vedika
 */
public class PassFailActivity extends GradedActivity{
    private double minPassingScore;
    
    public PassFailActivity(double mps) {
        
    }
    
    public char GetGrade(int score) {
       if (score >= minPassingScore)  {
           return 'P';
       } else {
           return 'F';
       }
    }
}
