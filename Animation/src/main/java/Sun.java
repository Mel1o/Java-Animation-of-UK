/**
	This is creating the sun and moon. Each composed of 3 circle classes with different colors to make it look like a minimalist sun.
	
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

import java. awt.*;
public class Sun implements DrawingObject{
    private Circle sunB;
    private Circle sunM;
    private Circle sunF;
    
    private Circle moonB;
    private Circle moonM;
    private Circle moonF;
    private double x;
    /** This is for creating the sun and moon. I only came up with the moon later on which is why it is only called the sun class**/
    public Sun(){
        sunB = new Circle(395,27.5,235, Color.getHSBColor(0.1361f, 0.544f, 1.f));
        sunM = new Circle(412.5,45,200, Color.getHSBColor(0.0889f, 0.631f, 1.f));
        sunF = new Circle(437.5,70,150, Color.white);
        
        moonB= new Circle(412.5,1166,200, Color.getHSBColor(0.6f, 0.32f, 0.992f));
        moonM= new Circle(432.5,1186,160, Color.white);
        moonF= new Circle(452.5,1206,120, Color.getHSBColor(0.122f, 0.40f, 1.f));
    }
    /** Just for drawing the shapes of the moon and sun**/
    public void draw(Graphics2D g2d){
       g2d.rotate(Math.toRadians(x),512.5,708);
       sunB.draw(g2d);
       sunM.draw(g2d);
       sunF.draw(g2d);
       moonB.draw(g2d);
       moonM.draw(g2d);
       moonF.draw(g2d);
       
    }
    /** This should make the sun and moon revolve around a point**/
    public void move(double n){
        if(x>=360){
            x=x-360;
        }
        x=x+n;
    }
    /** this should not change color but have to make it **/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("ooga booga");
    }
    
}
