import java.util.Scanner;

class Student {

    int rollNo;

    String name;

    int MathMark;

    int PhyMark;

    int ChemMark;

    void getRequiredDetails() {

        Scanner m = new Scanner(System.in);

        System.out.println("Enter name of the student:");
        name = m.nextLine();

        System.out.println("Enter student RollNo:");
        rollNo = m.nextInt();

        System.out.println("Enter Maths mark:");
        MathMark = m.nextInt();

        System.out.println("Enter Physics mark:");
        PhyMark = m.nextInt();

        System.out.println("Enter Chemistry mark:");
        ChemMark = m.nextInt();
        m.close();
    }

    void displayAvg() {
        double avg = (MathMark + PhyMark + ChemMark) / 3.0;
        System.out.println("Average marks of " + name + " = " + avg);
    }
}

public class Implement {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.getRequiredDetails();
        stu.displayAvg();
    }
}
