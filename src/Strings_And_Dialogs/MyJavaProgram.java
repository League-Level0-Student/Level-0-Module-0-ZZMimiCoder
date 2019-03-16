package Strings_And_Dialogs;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class MyJavaProgram {
	public static void main(String[] args) {
		Robot Zander = new Robot();
		JOptionPane.showMessageDialog(null, "Hello");
		Zander.setSpeed(12);
		for (int X = 0; X < 100; X++) {
			Zander.turn(90);
			Zander.move(50);
			Zander.move(-50);
		}
	}
}