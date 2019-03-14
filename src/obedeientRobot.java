import java.awt.Color;
import java.awt.geom.Ellipse2D;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedeientRobot {
	static Robot hobo = new Robot();
	public static void main(String[] args) {
		//drawSquare();
		//drawTriangle();
		//drawCircle();
		String sushi = JOptionPane.showInputDialog("What shape do you want the robot to draw? (All lowwercase plz) P.S. circle, square, and triangle! ");
		String xxx = JOptionPane.showInputDialog("What color do you whant the robot to draw? P.S. red, blue, green");
		if (xxx.equals("red")) {
			hobo.setPenColor(Color.red);
		}
		else if (xxx.equals("green")) {
			hobo.setPenColor(Color.green);
		}
		else if (xxx.equals("blue")) {
			hobo.setPenColor(Color.blue);
		}
		if (sushi.equals("square")) {
			drawSquare();
		}
		else if (sushi.equals("circle")) {
			drawCircle();
		}
		else if (sushi.equals("triangle")) {
			drawTriangle(); 
		}
	}
	static void drawSquare() {
		hobo.penDown();
		hobo.setSpeed(1000);
		hobo.move(200);
		hobo.turn(90);
		hobo.move(200);
		hobo.turn(90);
		hobo.move(200);
		hobo.turn(90);
		hobo.move(200);
		hobo.turn(90);
	}
	static void drawTriangle() {
		hobo.penDown();
		hobo.setSpeed(1000);
		hobo.turn(30);
		hobo.move(200);
		hobo.turn(120);
		hobo.move(200);
		hobo.turn(120);
		hobo.move(200);
		hobo.turn(120);
	}
	static void drawCircle() {
		hobo.penDown();
		hobo.setSpeed(1000);
		for (int i = 1; i < 361 ; i++) {
			hobo.turn(1);
			hobo.move(1);
		}
	}
} 














