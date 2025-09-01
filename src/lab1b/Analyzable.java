/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
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
