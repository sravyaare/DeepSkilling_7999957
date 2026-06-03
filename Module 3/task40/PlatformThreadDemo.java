public class PlatformThreadDemo {

    public static void main(String[] args)
            throws InterruptedException {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 1000; i++) {

            int taskId = i;

            new Thread(() -> {

                System.out.println(
                        "Platform Thread : " + taskId
                );

            }).start();
        }

        Thread.sleep(3000);

        long endTime = System.currentTimeMillis();

        System.out.println(
                "\nExecution Time: "
                        + (endTime - startTime)
                        + " ms"
        );
    }
}