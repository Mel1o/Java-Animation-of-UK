/**
	This class is basically an interface that will be implemented for every other class. TO keep everything uniform.
	
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
public interface DrawingObject {
    void draw(Graphics2D g2d);
    void move(double distance);
    void changeColor(float h1, float s1, float v1,float h2, float s2, float v2,float times );
}
