
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		rob.penDown();	
		rob.setSpeed(4);
		int count = 0;  
		while ( count < 4 ) {
			rob.move(120); 
			rob.turn(90);
			count += 1;
			rob.setPenWidth(10);
		}
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		JOptionPane.showInputDialog("Pick a color");
		//5. Use an if/else statement to set the pen color that the user requested
		if (input.equals ("Red")) {	
			x();
		}

		else if (input.equals ("Yellow")) {
			x();
		}

		else if (input.equals ("Blue")) {
			x();
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
