/**
	THis class is for starting the scene of the animation as the name suggests. It will be in charge of setting up the frame where the animation will take place.
	
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
public class SceneStarter {
    public static void main(String[] args) {
    SceneFrame sf= new SceneFrame();
    sf.setUpGUI();
    sf.setUpButtonListener();
    }
}
