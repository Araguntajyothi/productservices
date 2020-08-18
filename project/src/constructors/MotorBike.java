package constructors;//encapsulation example

public class MotorBike {
	private int speed;

	MotorBike() {
		// this.speed=5;
		// or
		this(5);// this will call one constructor from another constructor
	}
	MotorBike(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
		 {
			this.speed = speed;

		}
		}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {

		setSpeed(this.speed - howMuch);

	}
	void start() {
		System.out.println("Bike Started");
	}

}
