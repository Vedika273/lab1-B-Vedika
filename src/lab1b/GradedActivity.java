//https://github.com/Vedika273/lab1-B-Vedika

package lab1b;

/**
 * Stores numeric value of the grade
 * Also converts to letter grade 
 * 
 * @author Vedika
 */
public class GradedActivity {
   
    private double score; 
    
    public void setScore(double score) {
        if (score < 0 || score > 100 ) {
            System.out.println("Error : score must be between 0 and 100");
            return;
        }
        this.score = score;
    }
    
    public double getScore() {
        return score; 
    }
    
    public char getGrade() {
        
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
        else {
            return 'F';
        }
     }
}
