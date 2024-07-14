/**
	Creates the shape of a square. Basically just that, gets some values and creates a square out of those values to be used in other classes.
	
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

public class Square implements DrawingObject {
    private double x;
    private double y;
    private double size;
    private Color color;
    /** will be used for the drawing class. makes a square**/
    public Square(double x, double y, double size, Color color){
        this.x =x;
        this.y =y;
        this.size=size;
        this.color =color;
    }
    /** for drawing a square**/
    @Override
    public void draw(Graphics2D g2d) {
       Rectangle2D.Double c= new Rectangle2D.Double(x,y,size,size);
       g2d.setColor(color);
       g2d.fill(c);
    }
    /** Do not need this also also**/
    @Override
    public void move(double distance) {
        System.out.print("Hi! I like shorts! They're comfy and easy to wear!");
    }
    /** Do not need this for this class**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("https://www.youtube.com/watch?v=DLzxrzFCyOs");
    }
    
}
