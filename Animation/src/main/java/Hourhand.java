/**
	The Hour hand class. it is only a small part of the canvas. 
        * And only comprised of 2 shapes but it is the center of the canvas. To show the relative time in the animation.
	
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
public class Hourhand implements DrawingObject{
    private Color color=Color.getHSBColor(0.558f, 0.72f, 0.882f);
    private Circle c;
    private Rectangle r;
    private double x;
    
    private float num1;
    private float num2;
    private float num3;
    private float h;
    private float s;
    private float v;
    private boolean day=true;
    
    @Override
    public void draw(Graphics2D g2d){
        c= new Circle(509.5,227,6,color);
        r = new Rectangle(509.5, 210,515.5,230, color);
        
        
        g2d.rotate(Math.toRadians(x),512.5,230);
        
        c.draw(g2d);
        r.draw(g2d);
    }
    
    @Override
    public void move(double n){
        if(x>=360){
            x=x-360;
        }
        x=x+n*2;
    }
    
    public void changeColor(float h1, float s1, float v1,float h2, float s2, float v2,float times ) {
        
            num1=(h2-h1)/times;
            num2=(s2-s1)/times;
            num3=(v2-v1)/times;
        
        if (day==true){
            h=h+num1;
            s=s+num2;
            v=v+num3;
            
        
            color = Color.getHSBColor(h+h1, s+s1, v+v1);
                if(h+h1>=h2){
                    day=false;
                   
                }
                
        }
        
        
        else if(day==false){
            h=h-num1;
            s=s-num2;
            v=v-num3;
            
            color = Color.getHSBColor(h+h1, s+s1, v+v1);
                if(h+h1<=h1){
                    day=true;
                }
                
        }
}
}
