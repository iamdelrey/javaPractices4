package pr4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomExecutorService {
    private final int nThreads;
    private final List<WorkerThread> threads;
    private final BlockingQueue<Runnable> taskQueue;

    public CustomExecutorService(int nThreads) {
        this.nThreads = nThreads;
        this.taskQueue = new LinkedBlockingQueue<>();
        this.threads = new ArrayList<>(nThreads);

        for (int i = 0; i < nThreads; i++) {
            WorkerThread worker = new WorkerThread();
            worker.start();
            threads.add(worker);
        }
    }

    public void execute(Runnable task) {
        synchronized (taskQueue) {
            taskQueue.add(task);
            taskQueue.notify();
        }
    }

    private class WorkerThread extends Thread {
        public void run() {
            Runnable task;

            while (true) {
                synchronized (taskQueue) {
                    while (taskQueue.isEmpty()) {
                        try {
                            taskQueue.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    task = taskQueue.poll();
                }

                try {
                    task.run();
                } catch (RuntimeException e) {
                }
            }
        }
    }

    public void shutdown() {
        for (WorkerThread worker : threads) {
            worker.interrupt();
        }
    }
}
