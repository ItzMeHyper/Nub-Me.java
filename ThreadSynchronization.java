import java.util.Scanner;

class Table {
    void printTable(int n) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + "*" + i + "=" + n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class MyTab1 extends Thread {
    Table t;
    int n;

    MyTab1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(n);
    }
}

class MyTab2 extends Thread {
    Table t;
    int n;

    MyTab2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(n);
    }
}

public class ThreadSynchronization {
    public static void main(String args[]) {
        Table obj = new Table();
        Scanner sc = new Scanner(System.in);
        MyTab1 t1 = new MyTab1(obj);
        MyTab2 t2 = new MyTab2(obj);

        System.out.println("Enter the table you want to run by Thread1:");
        t1.n = sc.nextInt();
        System.out.println("Enter the table you want to run by Thread2:");
        t2.n = sc.nextInt();

        t1.start();
        t2.start();
        sc.close();
    }
}
