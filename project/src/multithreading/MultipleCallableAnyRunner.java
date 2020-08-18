package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableAnyRunner {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("in28minutes"), new CallableTask("ranga"),
				new CallableTask("adam"));
		String result = executorService.invokeAny(tasks);

		System.out.println(result);

		executorService.shutdown();
	}
}