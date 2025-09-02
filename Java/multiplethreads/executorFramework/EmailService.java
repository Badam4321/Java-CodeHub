package multiplethreads.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmailService {
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);
    public static void sendEmail(String email) {
        executorService.execute(
                () -> {
                    System.out.println("sending Email sent to " + email);
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Email sent to " + email);
                }
        );

    }
    public static Future<String>  RideMatching(String matchingId) {
        Future<String> future = executorService.submit(
                () -> {
                    Thread.sleep(1000);
                    return "Ride Matching started" + matchingId;
        });
        return future;
    }
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 50; i++) {
            Future<String> future = RideMatching("matcher" + i);
            System.out.println(future.get());
        }
        executorService.shutdown();

    }
}
