/**
	Draws a line of different lengths and positions. Basically just that, gets some values and creates a line out of those values to be used in other classes.
	
	@author Simeon, Marc Gerald M. (204722)
	@version April 11, 2021
**/

/*
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
*/
import java.awt.*;
import java.awt.geom.*;

public class Line implements DrawingObject{
    private double xstart;
    private double ystart;
    private double xend;
    private double yend;
    private double thicc;
    private Color color;
    private int c=1;
    
    /* constructs a line*/
    public Line(double xstart, double ystart,double xend, double yend, double thicc, Color color){
        this.xstart =xstart;
        this.ystart =ystart;
        this.xend =xend;
        this.yend =yend;
        this.thicc=thicc;
        this.color =color;
    }
    /** draws a line**/
    @Override
    public void draw(Graphics2D g2d) {
        Line2D.Double line = new Line2D.Double(xstart,ystart,xend,yend);
        g2d.setColor(color);
        g2d.draw(line); 
        while(thicc>=0){
            
            Line2D.Double line2 = new Line2D.Double(xstart+c,ystart,xend+c,yend);
            g2d.setColor(color);
            g2d.draw(line2); 
        
            Line2D.Double line3 = new Line2D.Double(xstart-c,ystart,xend-c,yend);
            g2d.setColor(color);
            g2d.draw(line3); 
            
            Line2D.Double line4 = new Line2D.Double(xstart-.5+c,ystart,xend+c,yend);
            g2d.setColor(color);
            g2d.draw(line4); 
        
            Line2D.Double line5 = new Line2D.Double(xstart+.5-c,ystart,xend-c,yend);
            g2d.setColor(color);
            g2d.draw(line5); 
            c=c+1;
            thicc=thicc-1;
        }  
    }
    /** do not need this to be called**/
    @Override
    public void move(double distance) {
        xstart=distance+xstart;
    }
    /** Do not need this for this class**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("hello");
    }
}
