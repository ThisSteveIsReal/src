package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
	
		Robot Steve= new Robot ();
		Steve.penDown();

	
		Steve.setSpeed(10);
		

		
		for (int i = 0; i < 75; i++) {
			
		

			
			Steve.setRandomPenColor();
	
			
			Steve.move(5*i);
	
		Steve.turn(360/7);
		
	
			
		Steve.setPenWidth(i);

	}}}

