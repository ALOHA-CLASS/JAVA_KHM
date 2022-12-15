package MS24_27;

public class RcCar implements RemoteControl {

	
	double battery;
	double speed;
	
	@Override
	public void turnOn() {
		System.out.println("turn on!");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off!");
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void changeBattery() {
		this.battery = 100;
	}

	
}
