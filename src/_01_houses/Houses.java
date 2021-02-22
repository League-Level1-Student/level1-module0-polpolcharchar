package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	
	static Robot r = new Robot();
	
	public void run() {
		r.moveTo(50, 500);
		r.penDown();
		r.setPenWidth(5);
		r.setSpeed(50);
		drawFlatRoof("small", "red");
		drawFlatRoof("large", "green");
		drawPointyRoof("medium", "blue");
		drawFlatRoof("small", "blue");
		drawPointyRoof("small", "red");
		drawPointyRoof("medium", "red");
		drawPointyRoof("large", "blue");
		r.hide();
		r.setWindowColor(Color.BLACK);
		
	}
	
	public static void drawFlatRoof(String height, String color) {
		r.setAngle(0);
		if(color.equalsIgnoreCase("red")) {
			r.setPenColor(Color.RED);
		}
		else if(color.equalsIgnoreCase("blue")) {
			r.setPenColor(Color.BLUE);
		}
		else if(color.equalsIgnoreCase("green")) {
			r.setPenColor(Color.GREEN);
		}
		
		
		if(height.equalsIgnoreCase("small")) {
			r.move(60);
		}
		else if(height.equalsIgnoreCase("medium")) {
			r.move(120);
		}
		else if(height.equalsIgnoreCase("large")) {
			r.move(250);
		}
		r.turn(90);
		r.move(50);
		r.turn(90);
		if(height.equalsIgnoreCase("small")) {
			r.move(60);
		}
		else if(height.equalsIgnoreCase("medium")) {
			r.move(120);
		}
		else if(height.equalsIgnoreCase("large")) {
			r.move(250);
		}
		r.turn(-90);
		r.setPenColor(Color.GREEN);
		r.move(50);
	}
	
	public static void drawPointyRoof(String height, String color) {
		r.setAngle(0);
		if(color.equalsIgnoreCase("red")) {
			r.setPenColor(Color.RED);
		}
		else if(color.equalsIgnoreCase("blue")) {
			r.setPenColor(Color.BLUE);
		}
		else if(color.equalsIgnoreCase("green")) {
			r.setPenColor(Color.GREEN);
		}
		
		
		if(height.equalsIgnoreCase("small")) {
			r.move(60);
		}
		else if(height.equalsIgnoreCase("medium")) {
			r.move(120);
		}
		else if(height.equalsIgnoreCase("large")) {
			r.move(250);
		}
		
		if(height.equalsIgnoreCase("large")) {
			r.turn(90);
			r.move(50);
			r.turn(90);
		}
		else {
		r.turn(45);
		r.move(40);
		r.turn(90);
		r.move(40);
		r.turn(45);
		}
		
		
		
		
		if(height.equalsIgnoreCase("small")) {
			r.move(60);
		}
		else if(height.equalsIgnoreCase("medium")) {
			r.move(120);
		}
		else if(height.equalsIgnoreCase("large")) {
			r.move(250);
		}
		r.turn(-90);
		r.setPenColor(Color.GREEN);
		r.move(50);
	}
	
	
	
	
	
	
	
	
	
}
