package Strings_And_Dialogs;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class Welcome {
	public static void main(String[] args) {
		Robot Zander = new Robot("mini");
		Zander.setSpeed(10);
		Zander.move(400);
		JOptionPane.showMessageDialog(null, "Welcome To Level 0!");
	}
}
