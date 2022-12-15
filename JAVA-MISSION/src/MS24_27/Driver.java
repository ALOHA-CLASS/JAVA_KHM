package MS24_27;

public class Driver {
	
	private static RemoteControl carControl;
	private static RemoteControl droneControl;
	
	public static void main(String[] args) {
		
		carControl = new RcCar();
		droneControl = new Drone();
		
		carControl.turnOn();
		carControl.setSpeed(100);
		carControl.changeBattery();
		carControl.turnOff();
		
		droneControl.turnOn();
		droneControl.setSpeed(100);
		droneControl.changeBattery();
		droneControl.turnOff();
		
	}

}
