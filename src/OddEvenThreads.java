public class OddEvenThreads {

    public static void main(String[] args) {

        // Thread for odd numbers
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd: " + i);
            }
        });

        // Thread for even numbers
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
            }
        });

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}