class MultiplesOfFiveThread extends Thread {
    public void run() {
        System.out.println("Multiples of 5 between 1 and 100:");
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MultiplesOfTenThread extends Thread {
    public void run() {
        System.out.println("Multiples of 10 between 100 and 200:");
        for (int i = 100; i <= 200; i += 10) {
            System.out.println(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {

        MultiplesOfFiveThread thread1 = new MultiplesOfFiveThread();
        MultiplesOfTenThread thread2 = new MultiplesOfTenThread();

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        thread2.start();
    }
}
