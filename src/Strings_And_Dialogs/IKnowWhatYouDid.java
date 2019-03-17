package Strings_And_Dialogs;

import javax.swing.JOptionPane;

public class IKnowWhatYouDid {
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("What Is Your Name?");
		JOptionPane.showMessageDialog(null, "I Know That You Pooped In Your Pants Last Summer, " + Name + ". Muahahahahaha");
	}
}
