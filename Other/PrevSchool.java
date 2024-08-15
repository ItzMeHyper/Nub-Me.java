import java.util.Scanner;

class School {
    Scanner sc = new Scanner(System.in);

    void NameDisplay() {

        System.out.println("Enter the school last Studied: ");
        String str = sc.nextLine();

        System.out.println("School last studied: " + str);
    }
}

public class PrevSchool {
    public static void main(String args[]) {

        School Prev = new School();

        Prev.NameDisplay();
    }
}