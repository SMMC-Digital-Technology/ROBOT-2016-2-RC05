import lejos.nxt.*;

/**
 * Standard file for LeJOS robots
 * Change every "Robot" below with the name of your program. eg "WallFinder"
 * Save the file with the same name. eg "WallFinder.java"
 *
 * @author	Matthew Trevillion
 * @version	0.1
 */

public class burtman {
	
	/**
	 * declare variables here
	 */
	// examples:
	// private TouchSensor sensorLeft;
	// private int code = 1234;
	private LightSensor light;
	private UltrasonicSensor ultra;
	
	/**
	 * Constructs the robot and sets up the sensors and initial values of variables
	 */
	public burtman() {
		// setup sensors
		light = new LightSensor(SensorPort.S2);
		ultra = new UltrasonicSensor(SensorPort.S1);
		
		// setup values
		
		
		run();
	}
	
	/**
	 * This is where the robot does something
	 */
	private void run() {
		// put in code here
		while ( ultra.getDistance() < 50 ){
				Motor.A.forward();
				Motor.C.forward();
		}
		while (ultra.getDistance() > 50 ) {
				Motor.A.forward();
				Motor.C.backward();
		}
	}
	
	/**
	 * The main function executes the robot.
	 * @param args Not used.
	 */
	public static void main (String[] args) {
		new burtman();
	}
}
