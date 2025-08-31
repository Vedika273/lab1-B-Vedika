/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1b;

/**
 *
 * @author Vedika
 */
public class Essay extends GradedActivity{
    private double grammar;
    private double spelling; 
    private double correctLength; 
    private double content; 
    
    public void setScore(double gr, double sp, double len, double cnt) {
        
    }
    
    public void setGrammar(double g) {
        this.grammar = g; 
    }
    
    public void setSpelling (double s ) {
        this.spelling = s; 
    }
    
    public void setCorrectLength(double c ) {
        this.correctLength = c; 
    }
    
    public void setContent (double c ) {
        this.content = c; 
    }
    
    public double getGrammar() {
        return grammar; 
    }
    
    public double getSpelling() {
        return spelling; 
    }
    
    public double getCorrectLength() {
        return correctLength;
    }
    
    @Override
    public double getScore() {
       return getScore();
    }
 }

