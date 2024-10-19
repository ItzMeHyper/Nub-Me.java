import java.util.*; 
 
class EvenNum implements Runnable { 
    public int a; 
    
    public EvenNum(int a) { 
        this.a = a; 
    } 
    
    public void run() { 
        System.out.println("The Thread " + a + " is EVEN and Square of " + a + " is : " + a * a); 
    } 
} 

class OddNum implements Runnable { 
    public int a; 
    
    public OddNum(int a) { 
        this.a = a; 
    } 
    
    public void run() { 
        System.out.println("The Thread " + a + " is ODD and Cube of " + a + " is: " + a * a * a); 
    } 
} 

class RandomNumGenerator extends Thread { 
    public void run() { 
        int n = 0; 
        Random rand = new Random(); 
        try { 
            for (int i = 0; i < 4; i++) { 
                n = rand.nextInt(20); 
                System.out.println("Generated Number is " + n);

                if (n % 2 == 0) { 
                    Thread thread1 = new Thread(new EvenNum(n)); 
                    thread1.start(); 
                } else { 
                    Thread thread2 = new Thread(new OddNum(n)); 
                    thread2.start(); 
                } 

                Thread.sleep(1000); 
                System.out.println("------------------------------------"); 
            } 
        } catch (Exception ex) { 
            System.out.println(ex.getMessage()); 
        } 
    } 
} 

public class MultiThread { 
    public static void main(String[] args) { 
        RandomNumGenerator rand_num = new RandomNumGenerator(); 
        rand_num.start(); 
    } 
}
