public class VirtualThreadDemo {

    public static void main(String[] args)
            throws InterruptedException {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int taskId = i;

            Thread.startVirtualThread(() -> {

                System.out.println(
                        "Virtual Thread : " + taskId
                );
            });
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