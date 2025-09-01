//https://github.com/Vedika273/lab1-B-Vedika

package lab1b;

/**
 * Essay is a graded activity with four components:
 * grammar (30), spelling (20), correct length (20), content (30).
 * Total max = 100.
 * @author Vedika
 */
public class Essay extends GradedActivity{
    private double grammar;
    private double spelling; 
    private double correctLength; 
    private double content; 
    
    //One method to set all components at once
    public void setScore(double gr, double sp, double len, double cnt) {
        setGrammar(gr);
        setSpelling(sp);
        setCorrectLength(len);
        setContent(cnt);
        
        double total = grammar + spelling + correctLength + content;
        super.setScore(total);
    }
    
    public void setGrammar(double g) {
        if (g < 0 || g > 30 ) {
            System.out.println("Grammar must be between 0 and 20");
        }
        this.grammar = g; 
    }
    
    public void setSpelling (double s ) {
        if (s < 0 || s > 20 ) {
            System.out.println("Spelling must 0 to 20");
        }
        this.spelling = s; 
    }
    
    public void setCorrectLength(double c ) {
        if (c < 0 || c > 20 ) {
            System.out.println("length must be between 0 and 20");
        }
        this.correctLength = c; 
    }
    
    public void setContent(double c ) {
        if ( c < 0 || c > 30) {
            System.out.println("Length must be 0 to 30");
        }
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
    
    public double getContent() {
        return content;
    }
    
    @Override
    public double getScore() {
       return super.getScore();
    }
 }

