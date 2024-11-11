/*
 * Write a Java program that creates three threads. First thread generates a random positive number (>1) every 1 second. 
 * If the number is even, the second thread prints all even numbers between 1 and the generated number. 
 * If the number is odd, the third thread will print all odd numbers between 1 and the generated number.
 */

import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                int num = rand.nextInt(20) + 2;
                System.out.println("Generated Number: " + num);

                if (num % 2 == 0) {
                    Thread evenThread = new Thread(new EvenPrinter(num));
                    evenThread.start();
                } else {
                    Thread oddThread = new Thread(new OddPrinter(num));
                    oddThread.start();
                }

                Thread.sleep(1000);
                System.out.println("------------------------------------");
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class EvenPrinter implements Runnable {
    private int num;

    public EvenPrinter(int num) {
        this.num = num;
    }

    public void run() {
        System.out.print("Even numbers up to " + num + ": ");
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddPrinter implements Runnable {
    private int num;

    public OddPrinter(int num) {
        this.num = num;
    }

    public void run() {
        System.out.print("Odd numbers up to " + num + ": ");
        for (int i = 1; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class MultiThread1 {
    public static void main(String[] args) {
        NumberGenerator generatorThread = new NumberGenerator();
        generatorThread.start();
    }
}
