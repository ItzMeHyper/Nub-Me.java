import java.util.Scanner;

class Even_Odd{
    Scanner sc = new Scanner(System.in);

    void checkEvenOdd(){
        
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if( n%2 == 0 ){
            System.out.println(+n+" is even");
        } else {
            System.out.println(+n+" is odd");
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        Even_Odd EO = new Even_Odd();
        EO.checkEvenOdd();
    }
    
}