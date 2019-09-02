package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] robotArray = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robotArray.length; i++) {
			 robotArray[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
			 robotArray[i].setY(500);
			 robotArray[i].setX(180*i+50);
		}		
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    		for (int i = 0; i < robotArray.length; i++) {
    			Random r = new Random();
			robotArray[i].move(r.nextInt(50));
    		}
    	
		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
