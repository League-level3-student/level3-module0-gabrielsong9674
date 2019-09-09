package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robotArray = new Robot[3];
		int winner = 0;
		boolean haveWon = false;
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robotArray.length; i++) {
			robotArray[i] = new Robot();
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robotArray[i].setY(350);
			robotArray[i].setX(100);
			robotArray[i].setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		while (!haveWon) {
			for (int j = 0; j < 60; j++) {
				for (int i = 0; i < robotArray.length; i++) {
					Random r = new Random();
					robotArray[i].penDown();
					int robotMove = r.nextInt(robotArray.length);
					robotArray[robotMove].turn(6);
					robotArray[robotMove].move(20);
					if(robotArray[i].getX()>100 && robotArray[i].getY()<350) {
						haveWon = true;
						winner = i;
						
					}
				}
			}

		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		// 7. declare that robot the winner and throw it a party!
		System.out.println("Robot " + winner + " won!");
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}
}
/*
 * while(!haveWon) { (straight line race) for (int i = 0; i < robotArray.length;
 * i++) { Random r = new Random(); robotArray[i].move(r.nextInt(50));
 * robotArray[i].turn(1); if(robotArray[i].getY()<=0) { winner = i; haveWon =
 * true; } } }
 * 
 */