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

class MyTab5 extends Thread {
    Table t;

    MyTab5(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class MyTab100 extends Thread {
    Table t;

    MyTab100(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class ThreadSynchronization {
    public static void main(String args[]) {
        Table obj = new Table();
        MyTab5 t1 = new MyTab5(obj);
        MyTab100 t2 = new MyTab100(obj);

        t1.start();
        t2.start();
    }
}
