package Strings_And_Dialogs;
import javax.swing.JOptionPane;
public class EverythingIsAwesome {
	public static void main(String[] args) {
		String Thing = JOptionPane.showInputDialog("What Do You Like?");
		JOptionPane.showMessageDialog(null, Thing + " Is Awesome");
	}
}
