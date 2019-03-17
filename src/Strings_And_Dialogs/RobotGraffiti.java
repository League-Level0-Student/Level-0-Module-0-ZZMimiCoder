package Strings_And_Dialogs;
import org.jointheleague.graphical.robot.Robot;
public class RobotGraffiti {
	public static void main(String[] args) {
		Robot Zander = new Robot("mini");
		Zander.penDown();
		Zander.setSpeed(100);
		Zander.turn(90);
		Zander.move(100);
		Zander.turn(135);
		Zander.move(150);
		Zander.turn(-135);
		Zander.move(100);
	}
}
