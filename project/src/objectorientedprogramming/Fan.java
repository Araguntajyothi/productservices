package objectorientedprogramming;

public class Fan {
	// state of the object
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed;// 0 to 5

	// creation of the objects,what types of constructors do you want

	public Fan(String make, double radius, String color) {
		super();
		this.make = make;
		this.radius = radius;
		this.color = color;
	}



	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 3);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	// print the state
	@Override
	public String toString() {
		return String.format("make - %s , radius - %f , color - %s , isOn - %b , speed - %d", make, radius, color, isOn,
				speed);
	}


}
