
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they were born. If they are over 30, tell them
 * they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("how old are you?");
		int a = Integer.parseInt(age);
		if (a > 30) {
			JOptionPane.showMessageDialog(null, "your to old for this game");
		} else {
			int b = 2016 - a;
			JOptionPane.showMessageDialog(null, b);
		}

	}
}