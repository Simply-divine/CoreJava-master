package chapter9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool{
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for (int i = 0; i <10 ; i++) {
            Runnable worker=new Executor(""+i);
            executorService.execute(worker);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){

        }
        System.out.println("finished all threads");
    }
}
