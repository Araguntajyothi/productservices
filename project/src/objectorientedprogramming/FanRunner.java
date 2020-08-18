package objectorientedprogramming;

public class FanRunner {

	public static void main(String[] args) {

		Fan fan = new Fan("Manufacturer 1", 0.34567, "Green");
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte) 5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}