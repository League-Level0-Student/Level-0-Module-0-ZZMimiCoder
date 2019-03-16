package Strings_And_Dialogs;
import org.jointheleague.graphical.robot.Robot;
public class RobotSquare {
    public static void main(String[] args) throws Exception {
    		Robot Zander = new Robot();
    		Zander.penDown();
    		Zander.setSpeed(100);
    		for (int X = 0; X < 4; X++) {
    			for (int Y = 0; Y < 4; Y++) {
    			Zander.move(200);
    			Zander.turn(90);
    			}
    			Zander.turn(90);
    		}
    }
}
