package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class gulags {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
	
		rob.miniaturize();
		rob.setX(40);
		rob.setSpeed(1000);
		rob.penDown();
		for(int i=0; i<9; i++) {
	   Random rand = new Random();
		drawflathouse();
		}
	}
	void drawpeakhouse() {
		rob.move(40);
		rob.turn(30);	
		rob.move(25);	
		rob.turn(120);		
		rob.move(25);
		rob.turn(30);	
		rob.move(40);
		rob.turn(270);
		rob.move(25);
	}
	
	
static void drawflathouse(int height) {
	rob.move(100);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(100);
	rob.turn(-90);
	rob.move(25);
	rob.turn(270);
}
}
