import java.util.Scanner;

class Vote {
    Scanner sc = new Scanner(System.in);

    void Age() {

        System.out.println("Enter the age of the candidate:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("The candidate is eligible to vote.");
        } else if (age < 18) {
            System.out.println("The candidate is not eligible.");
        } else if(age < 0) {
            System.out.println("Invalid input.");
        }
    }
}

public class EligibleVote {
    public static void main(String args[]) {

        Vote a1 = new Vote();

        a1.Age();
    }
}