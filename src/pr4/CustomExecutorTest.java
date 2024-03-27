package pr4;

public class CustomExecutorTest {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(3);

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executorService.execute(() -> {
                System.out.println("Задание " + taskId + " выполняется потоком: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
