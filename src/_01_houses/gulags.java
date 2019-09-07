package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class gulags {
	static Robot rob = new Robot();
	public static void main(String[] args) {
		
	
		rob.miniaturize();
		rob.setX(40);
		rob.setSpeed(1000);
		rob.penDown();
		for(int i=0; i<=10; i++) {
	   Random rand = new Random();
	   int fish = rand.nextInt(3);
	   if(fish==0) {
	    drawpeakhouse("small", Color.BLACK);
	   }
	   else if(fish==1) {
		    drawpeakhouse("meduim", Color.white);
		   }
	   else if(fish==2) {
		    drawflathouse("large", Color.red);
		   }
		}
	}
	static void drawpeakhouse(String height, Color lgbdq) {
		rob.setPenColor(lgbdq);
		int kaiserwilhelm2 = 0;
		if(height.equals("small")) {
			kaiserwilhelm2 = 60;	
			}
			else if(height.equals("medium")) {
			kaiserwilhelm2 = 120;
			}
			else if(height.equals("large")) {
			kaiserwilhelm2 = 250;
			}
			else {
				kaiserwilhelm2 = 200;
			}
		rob.move(kaiserwilhelm2);
		rob.turn(30);	
		rob.move(25);	
		rob.turn(120);
		rob.move(25);
		rob.turn(30);
		rob.move(kaiserwilhelm2);
		rob.turn(-90);
		rob.move(25);
		rob.turn(270);
	}
	
	
static void drawflathouse(String height, Color lgbdq) {
	rob.setPenColor(lgbdq);
	int kaiserwilhelm2 = 0;
	if(height.equals("small")) {
	kaiserwilhelm2 = 60;	
	}
	else if(height.equals("medium")) {
	kaiserwilhelm2 = 120;
	}
	else if(height.equals("large")) {
	kaiserwilhelm2 = 250;
	}
	else {
		kaiserwilhelm2 = 200;
	}
	rob.move(kaiserwilhelm2);
	rob.turn(90);
	rob.move(25);
	rob.turn(90);
	rob.move(kaiserwilhelm2);
	rob.turn(-90);
	rob.move(25);
	rob.turn(270);
}
}
