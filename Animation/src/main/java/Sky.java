
/**
	This class is for creating the morning sky in the animation. Comprised of 5 rectangles to imitate the horizon. 
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
public class Sky implements DrawingObject{
    private Rectangle d1;
    private Rectangle d2;
    private Rectangle d3;
    private Rectangle d4;
    private Rectangle d5;
    
    private int height=240;
    private int L=1030;
    private double y=0;
    /** This makes the sky. Took me a while to get the colors right. I wanted it to transition more smoothly to the night but gave up**/
    @Override
    public void draw(Graphics2D g2d){
     
        d1= new Rectangle(0,0-height*2+y,L,0-height+y,Color.getHSBColor(0.492f, 0.38f, 0.898f));
        d2= new Rectangle(0,0-height+y,L,0+y,Color.getHSBColor(0.487f, 0.261f, 0.992f));
        d3= new Rectangle(0,0+y,L,height+y,Color.getHSBColor(0.1444f, 0.337f, 1f));
        d4= new Rectangle(0,height+y,L,height*2+y,Color.getHSBColor(0.487f, 0.261f, 0.992f));
        d5= new Rectangle(0,height*2+y,L,height*3+y,Color.getHSBColor(0.492f, 0.38f, 0.898f));
        
        d1.draw(g2d);
        d2.draw(g2d);
        d3.draw(g2d);
        d4.draw(g2d);
        d5.draw(g2d);
        
       
    }
    /** for the sky to move**/
    @Override
    public void move(double distance){
        y=y+distance;
        if(y>=1500){
            y=-900;
        }
    }
    /** THe sky just moves here, the rectangles do not change color**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("Never ganna guve you up");
    }
}
