/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 *
 * @author Vedika
 */
public class GradedActivity {
   
    private double score; 
    
    public void setScore(double score) {
        this.score = score;
    }
    
    public double getScore() {
        return score; 
    }
    
    public char getGrade(double score) {
        
        if (score > 100 || score < 0) {
            System.out.println("score can not exceed 100 nor be negatif");
        }
        
        if (score >= 90) {
            return 'A';
        }
        else if(score >= 80) {
            return 'B';
        }
        else if (score >= 70) {
            return 'C';
        }
        else if (score >= 60) {
            return 'D';
        }
        else if (score < 60 ) {
            return 'F';
        }
        else {
            return '0';  //never arrive here
        }
     }
}
