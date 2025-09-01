
//https://github.com/Vedika273/lab1-B-Vedika

package lab1b;

/**
 * The Analyzable interface defines operations
 * that return statistical information about
 * a collection of graded activities.
 * 
 * @author Vedika
 */

public interface Analyzable {
   double getAverage();
   GradedActivity getHighest();
   GradedActivity getLowest();
}
