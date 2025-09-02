package multiplethreads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class  ETACalculationTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Thread creation using Callable";
    }
}
public class ThreadCreationCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ETACalculationTask task = new ETACalculationTask();
        FutureTask<String> futureTask = new FutureTask<>(task);
        Thread t1 = new Thread(futureTask);
        t1.start();
        System.out.println(futureTask.get());
        System.out.println("main thread");

    }
}
