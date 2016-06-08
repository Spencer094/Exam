import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw
		String penc = JOptionPane.showInputDialog("Do you want the robot to draw in blue or black?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		Robot robo = new Robot();
		if (penc .equals("blue")) {
			robo.setPenColor(000, 119, 221);

		} else {
			robo.setPenColor(000, 000, 000);

		}
		// 2. set the pen width to 10

		// 1. make the Robot draw a shape
	
			robo.setPenWidth(10);
		robo.penDown();
		robo.move(200);
		robo.turn(90);
		robo.move(200);
		robo.turn(90);
		robo.move(200);
		robo.turn(90);
		robo.move(200);
		robo.turn(90);
	}

}