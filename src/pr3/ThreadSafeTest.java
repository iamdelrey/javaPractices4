package pr3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeTest {

    public static void main(String[] args) {
        testThreadSafeList();
        testThreadSafeMap();
    }

    private static void testThreadSafeList() {
        ThreadSafeList<Integer> threadSafeList = new ThreadSafeList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.submit(() -> {
                threadSafeList.add(index);
                System.out.println("Добавлено " + index);
            });
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        System.out.println("Итоговый список: " + threadSafeList);
    }

    private static void testThreadSafeMap() {
        ThreadSafeMap<String, Integer> threadSafeMap = new ThreadSafeMap<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            final int index = i;
            executorService.submit(() -> {
                threadSafeMap.put("Ключ " + index, index);
                System.out.println("Добавлено: Ключ " + index + " -> " + index);
            });
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }

        System.out.println("Итоговый словарь: " + threadSafeMap);
    }
}
