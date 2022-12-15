package MS24_27;

public interface RemoteControl {

	int MAX_SPEED = 200;
	int MIN_SPEED = 0;
	
	void turnOn();
	void turnOff();
	
	void setSpeed(int speed);
	void changeBattery();
	
}
