/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 * A PassFailActivity only returns 'P' or 'F'
 * depending on whether the score meets the minimum.
 * @author Vedika
 */
public class PassFailActivity extends GradedActivity{
    private double minPassingScore;
    
    //constructor , stores the minimum passing score
    public PassFailActivity(double mps) {
        this.minPassingScore = mps; 
    }
    
    
    public char GetGrade() {
       if (getScore() >= minPassingScore)  {
           return 'P';
        }else{
           return 'F';
        }
    }
    
    public double getminPassingScore() {
        return minPassingScore; 
    }
}
