import reversepackage.Reverse;
import java.util.Scanner;

public class Rev {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        
        Reverse reverseObj = new Reverse();
        
        reverseObj.reverse(num);
        
        sc.close();
    }
}
