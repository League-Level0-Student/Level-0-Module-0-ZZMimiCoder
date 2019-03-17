package Strings_And_Dialogs;
import javax.swing.JOptionPane;
public class Greeter {
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("What Is Your Name?");
		JOptionPane.showMessageDialog(null, "Hi, " + Name);
	}
}
