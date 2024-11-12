import java.util.Scanner;

class Opeation {

    synchronized void add(int n1, int n2) {
        int result = n1 + n2;
        System.out.println("Addition: " + n1 + " + " + n2 + " = " + result);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void subtract(int n1, int n2) {
        int result = n1 - n2;
        System.out.println("Subtraction: " + n1 + " - " + n2 + " = " + result);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void multiply(int n1, int n2) {
        int result = n1 * n2;
        System.out.println("Multiplication: " + n1 + " * " + n2 + " = " + result);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void divide(int n1, int n2) {
        if (n2 != 0) {
            double result = (double) n1 / n2;
            System.out.println("Division: " + n1 + " / " + n2 + " = " + result);
        } else {
            System.out.println("Division by zero is not allowed!");
        }
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Add extends Thread {
    Opeation calc;
    int n1, n2;

    Add(Opeation calc, int n1, int n2) {
        this.calc = calc;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {
        calc.add(n1, n2);
    }
}

class Sub extends Thread {
    Opeation calc;
    int n1, n2;

    Sub(Opeation calc, int n1, int n2) {
        this.calc = calc;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {
        calc.subtract(n1, n2);
    }
}

class Multi extends Thread {
    Opeation calc;
    int n1, n2;

    Multi(Opeation calc, int n1, int n2) {
        this.calc = calc;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {
        calc.multiply(n1, n2);
    }
}

class Div extends Thread {
    Opeation calc;
    int n1, n2;

    Div(Opeation calc, int n1, int n2) {
        this.calc = calc;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {
        calc.divide(n1, n2);
    }
}

public class MultiThreadCalculator {
    public static void main(String args[]) {
        Opeation calc = new Opeation();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        Add addThread = new Add(calc, n1, n2);
        Sub subThread = new Sub(calc, n1, n2);
        Multi multiThread = new Multi(calc, n1, n2);
        Div divThread = new Div(calc, n1, n2);

        addThread.start();
        subThread.start();
        multiThread.start();
        divThread.start();

        sc.close();
    }
}
