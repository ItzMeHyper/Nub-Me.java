class EvenNumberPrinter extends Thread {
    public void run() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}
class OddNumberPrinter extends Thread {
    public void run() {
        for (int i = 50; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}
public class OddEvenPrinter {
    public static void main(String[] args) {
        Thread evenThread = new EvenNumberPrinter();
        Thread oddThread = new OddNumberPrinter();

        evenThread.start();
        oddThread.start();
        
        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finished printing odd and even numbers.");
    }
}
