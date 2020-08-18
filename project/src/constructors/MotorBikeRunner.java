package constructors;//encapsulation example

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike();
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(suzuki.getSpeed());

		ducati.start();
		honda.start();

		// ducati.setSpeed(-100);
		// System.out.println(ducati.getSpeed());
		// ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		ducati.decreaseSpeed(250);
		honda.decreaseSpeed(250);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());




	}

}
