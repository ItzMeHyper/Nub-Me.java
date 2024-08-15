import java.util.Scanner;

class Avg {
    Scanner sc = new Scanner(System.in);

    void checkAvg() {
        int x,y,z,sum;
        double avg;

        System.out.println("Enter 3 numbers x,y,z:");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        sum = x+y+z;
        avg = sum/3.0;

        System.out.print("The average of given three numbers is: "+avg);
    }
}

public class Avg_3Num {
    public static void main(String[] args) {
        Avg check = new Avg();
        check.checkAvg();
    }
}
