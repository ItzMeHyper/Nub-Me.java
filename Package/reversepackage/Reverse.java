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

    public void strrev(String str){
        String rev = "";
        for (int i = str.length(); i > 0; --i) {
            rev = rev + (str.charAt(i - 1));
        }
        System.out.println("Reverse String  is : " +rev);
    }
}
