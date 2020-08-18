package multithreading;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask1 started");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task 1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 started");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task 2 Done");
	}

}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {

		// NEW
		// RUNNABLE
		// RUNNING
		// BLOCKED/WAITING
		// TERMINATED/DEAD
		System.out.println("\n task1 kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		System.out.println("\n task2 kicked off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();


		// wait for task 1 to be completed
		task1.join();
		task2Thread.join();

		System.out.println("\n task3 kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n Task 3 Done");
		System.out.println("\n main task Done");

	}
}
