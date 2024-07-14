/**
	The class where all the magic happens with drawing every class that is instantiated. Will be repeated and repainted to create the illusion of movement.
	
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

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class SceneCanvas extends JComponent {
    private int width;
    private int height;
    private Color bg;
    
    private DrawingObject art[]= new DrawingObject[13];

    public SceneCanvas(int w, int h, Color bgc){
       width=w;
       height=h;
       bg=bgc;
       
       setPreferredSize(new Dimension(width,height));  
       
       this.art[0] = new Skyn();
       this.art[1] = new Sky();
       this.art[2] = new Sun();
       this.art[3] = new Cars();
       this.art[4] = new Cars ();
       this.art[5] = new Cars ();
       this.art[6] = new Buildings();
       this.art[7] = new Minutehand();
       this.art[8] = new Hourhand();
       this.art[9] = new Water();
       this.art[11] = new Waterf();
       this.art[10] = new Waterm();
       this.art[12] = new Balls();
       
       
    }
    /** the method that will draw every class**/
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d= (Graphics2D) g;
        
        RenderingHints rh=new RenderingHints (RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);
        
        AffineTransform reset=g2d.getTransform();
        
        Rectangle2D.Double background =new Rectangle2D.Double(0,0,width,height);
        g2d.setColor(bg);
        g2d.fill(background);
        
        for(int i=0;i<=12;i++){
            art[i].draw(g2d);
            g2d.setTransform(reset);
        }
        
    }
    /** All of these are just meant for the SceneFrame class to call upon and update**/
    public DrawingObject returnSun(){
        return art[2];
    }
    public DrawingObject returnBuilding(){
        return art[6];
    }
    public DrawingObject returnHourhand(){
        return art[8];
    }
    public DrawingObject returnMinutehand(){
        return art[7];
    }
    public DrawingObject returnSky(){
        return art[1];
    }
    public DrawingObject returnSkyn(){
        return art[0];
    }
    public DrawingObject returnBalls(){
        return art[12];
    }
    public DrawingObject returnWater(){
        return art[9];
    }
    public DrawingObject returnWaterm(){
        return art[10];
    }
    public DrawingObject returnWaterf(){
        return art[11];
    }
    public DrawingObject returnCars(){
        return art[4];
    }
    public DrawingObject returnCars2(){
        return art[3];
    }
    public DrawingObject returnCars3(){
        return art[5];
    }
    
}
