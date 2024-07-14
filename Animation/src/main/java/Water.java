/**
	This class is to create the 1 rectangle to be the ocean. It is just 1 rectangle but it changes color and move smoothly. 
        * And is meant to be related to the other 2 water classes.
	
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
public class Water implements DrawingObject {
    private Rectangle d1;
    
    private Color color=Color.getHSBColor(0f, 0f, 1f);
    private final int length=1024;
    
    private double y=600;
    private double space=0.8;
    private final double c=space;
    private boolean down=true;
    
    private float num1;
    private float num2;
    private float num3;
    private float h;
    private float s;
    private float v;
    private boolean day=true;
    
    /** For the ocean part that will move. just one rectangle**/
    @Override
    public void draw(Graphics2D g2d){
        d1= new Rectangle(0,y,length,700,color);
        d1.draw(g2d); 
    }
    /** Could have been more efficient but should work for now**/
    @Override
    public void move(double distance) {
        
        if(down==true){
        y=y+space;
        space=space-distance;
        if(space<=-1){
            space=c;
            down=false;
        }
        }
        if(down==false){
        y=y-space;
        space=space-distance;
        if(space<=-1){
            space=c;
            down=true;
        }
        }
          
    }
    /** changing the color of the back rectangle of the water from morning to night and vice versa**/
    public void changeColor(float h1, float s1, float v1,float h2, float s2, float v2,float times ) {
       
            num1=(h2-h1)/times;
            num2=(s2-s1)/times;
            num3=(v2-v1)/times;
        
        if (day==true){
            color = Color.getHSBColor(h+h1, s+s1, v+v1);
            h=h+num1;
            s=s+num2;
            v=v+num3;
                if(h+h1>=h2){
                    day=false;
                }
        }
        else if(day==false){
            color = Color.getHSBColor(h+h1, s+s1, v+v1);
            h=h-num1;
            s=s-num2;
            v=v-num3; 
                if(h+h1<=h1){
                    day=true;
                }   
        }    
    }   
    
}
