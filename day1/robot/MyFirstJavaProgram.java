package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot Steve = new Robot();
		Steve.setPenColor(Color.MAGENTA);
		Steve.penDown();
		
		Steve.move(100);
		Steve.turn(30);
		Steve.move(100);
		Steve.turn(100);
		Steve.move(100);
		Steve.turn(100);
		Steve.move(100);
			
			
			

		
	}
}
