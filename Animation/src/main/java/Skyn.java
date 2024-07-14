/**
	This class is for creating the night sky in the animation. Comprised of 5 rectangles to imitate the horizon. 
        But only 3 different rectangles, 2 are repeated but with a different y value.
	
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
public class Skyn implements DrawingObject {
    private Rectangle n1;
    private Rectangle n2;
    private Rectangle n3;
    private Rectangle n4;
    private Rectangle n5;
    
    private final int height=240;
    private final int L=1030;
    private double y=0;
    /** This is the same with the sky class but it is for the night so it has much darker and cooler colors. Moves with the sky class**/
    @Override
    public void draw(Graphics2D g2d){
        n1= new Rectangle(0,0-height*7+y,L,0-height*6+y,Color.getHSBColor(0.542f, 0.59f, 0.676f));
        n2= new Rectangle(0,0-height*6+y,L,0-height*5+y,Color.getHSBColor(0.592f, 0.654f, 0.64f));
        n3= new Rectangle(0,0-height*5+y,L,0-height*4+y,Color.getHSBColor(0.61f, 0.71f, 0.512f));
        n4= new Rectangle(0,0-height*4+y,L,0-height*3+y,Color.getHSBColor(0.592f, 0.654f, 0.64f));
        n5= new Rectangle(0,0-height*3+y,L,0-height*2+y,Color.getHSBColor(0.542f, 0.59f, 0.676f));
        
        n1.draw(g2d);
        n2.draw(g2d);
        n3.draw(g2d);
        n4.draw(g2d);
        n5.draw(g2d);

    }
    /** Moves the 5 rectangles that makes the night sky. Pretty much the same with the sky class**/
    @Override
    public void move(double distance){
        y=y+distance;
        if(y>=2400){
            y=0;
        }
    }
    /** I do not need this to be called**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("hmmm monkeh");
    }
}
