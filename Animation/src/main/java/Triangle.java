/**
	Creates the shape of a triangle. Basically just that, gets some values and creates a square out of those values to be used in other classes.
	
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

public class Triangle implements DrawingObject {
    private double x;
    private double y;
    private double height;
    private double length;
    private Color color;
    /** for making and constructing a triangle**/
    public Triangle(double x, double y, double height, double length, Color color){
        this.x =x;
        this.y =y;
        this.height=height;
        this.length=length;
        this.color =color;
    }
    /** for drawing a triangle**/
    @Override
    public void draw(Graphics2D g2d) {
       Path2D.Double t =new Path2D.Double();
       t.moveTo(x, y+height);
       t.lineTo(x+length/2,y);
       t.lineTo(x+length,y+height);
       t.closePath();
       g2d.setColor(color);
       g2d.fill(t);
    }
    /** do not need this to be called**/
    @Override
    public void move(double distance) {
        System.out.print("why are we here?");
    }
    /** do not need this also**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("just to suffer?");
    }

}
