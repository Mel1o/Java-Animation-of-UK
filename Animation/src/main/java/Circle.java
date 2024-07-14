/**
	Creates the shape of a circle. Basically just that, gets some values and creates a circle out of those values to be used in other classes.
	
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
public class Circle implements DrawingObject {
    
    private double x;
    private double y;
    private double size;
    private Color color;
    /** Constructing a circle thing**/
    public Circle(double x, double y, double size, Color color){
        this.x =x;
        this.y =y;
        this.size=size;
        this.color =color;
    }
    /** Drawing a circle**/
    @Override
    public void draw(Graphics2D g2d) {
       Ellipse2D.Double c= new Ellipse2D.Double(x,y,size,size);
       g2d.setColor(color);
       g2d.fill(c);
    }
    /** do not need this to be called**/
    @Override
    public void move(double distance) {
        x=x+distance;
    }
    /** Do not need this for this class**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("hello world");
    }
    
}
