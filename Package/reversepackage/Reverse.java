package reversepackage;

public class Reverse {
    public void reverse(int num) {
        int rev = 0, r;
        while (num != 0) {
            r = num % 10;
            rev = rev * 10 + r; 
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
