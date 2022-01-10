package concurrency;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class SheepManager {
    private int sheepCount = 0;
    private AtomicInteger atomicSheepCount = new AtomicInteger(0);

    void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

    void atomicIncrementAndReport() {
        System.out.print(atomicSheepCount.incrementAndGet() + " ");
    }

    void synchronizedIncrementAndReport() {
        synchronized(this) {
            System.out.print((++sheepCount) + " ");
        }
    }
}

class SheepManagerTask implements Callable<Long> {
    private int sheepCount = 0;
    private AtomicInteger atomicSheepCount = new AtomicInteger(0);

    public Long call() throws Exception {
        long start = System.currentTimeMillis();

        System.out.print((++sheepCount) + " ");

        long end = System.currentTimeMillis();
        return (end - start);
    }
}

public class ThreadSafeTests {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = null;
        Future task = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for(int i = 0; i < 10000; i++) {
                task = service.submit(new SheepManagerTask());
            }
        }
        finally {
            if(service != null) service.shutdown();
            System.out.println("Time: " + task.get());
        }
    }
}
