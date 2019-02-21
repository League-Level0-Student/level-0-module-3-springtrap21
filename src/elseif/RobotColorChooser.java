//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bigChungus = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 10001; i++) {
			
		
		String grinch = ""; //JOptionPane.showInputDialog("Which color do you whant the robot to draw? P.S. btw the robot's name is BigChungus!!!");
		//5. Use an if/else statement to set the pen color that the user requested
		if (grinch.equals("red")) {
			bigChungus.setPenColor(Color.red);
		}
		else if (grinch.equals("blue")){	
			bigChungus.setPenColor(Color.cyan);
		}
		else if (grinch.equals("green")){
			bigChungus.setPenColor(Color.green);
		}
		else if (grinch.equals("orange")) {
			bigChungus.setPenColor(Color.orange);
		}
		else if (grinch.equals("yellow")) {
			bigChungus.setPenColor(Color.yellow);
		}
		else if (grinch.equals("purple")) {
			bigChungus.setPenColor(Color.magenta);
		}
        //6. If the user doesn’t enter anything, choose a random color
		if (grinch.equals("")) {
			bigChungus.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bigChungus.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bigChungus.setSpeed(1000000);
		bigChungus.penDown();
		bigChungus.move(100);
		bigChungus.turn(90);
		bigChungus.move(100);
	    bigChungus.turn(90);
	    bigChungus.move(100);
	    bigChungus.turn(90);
	    bigChungus.move(100);
	    bigChungus.turn(304);
		}  
	}

	
	
	
}
