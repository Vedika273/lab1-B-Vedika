//https://github.com/Vedika273/lab1-B-Vedika

package lab1b;

/**
 * A PassFailActivity only returns 'P' or 'F'
 * depending on whether the score meets the minimum passing grade
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
