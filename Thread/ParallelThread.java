/*
 * Write a program that creates two threads. 
 * First thread prints the numbers from 1 to 100 and the other thread prints the numbers from 100 to 1. 
 * Execute the two threads in parallel.
 */

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread A: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread A is finished.");
    }
}
class B extends Thread{
    public void run(){
        for(int i = 100; i>=1; i--){
            System.out.println("Thread B: "+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread B is finished.");
    }
}

public class Parallelthread {
    public static void main(String args[]){
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();
    }
}
