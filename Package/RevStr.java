import reversepackage.Reverse;
import java.util.Scanner;

public class RevStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        
        Reverse reverseObj = new Reverse();
        
        reverseObj.strrev(str);
        
        sc.close();
    }
}
