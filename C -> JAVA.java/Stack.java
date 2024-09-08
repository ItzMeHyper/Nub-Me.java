import java.util.Scanner;

class Functions {
    int[] stack;
    int top;
    int max;
    int dlt_value;

    Functions(int Size) {
        max = Size;
        top = -1;
        stack = new int[max];
    }

    void Push(int value) {
        if (top == max - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed onto the stack");
        }
    }

    void Pop() {
        if(top == -1){
            System.out.println("Stack underflow");
        } else {
            dlt_value = stack[top];
            top--;
            System.out.println(dlt_value+ " popped from the stack.");
        }
    }

    void Display() {
        if (top == -1) {
            System.out.println("Stack is empty\n");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.print( stack[i]+ "  ");
            }
        }
    }

}

public class stack {
    public static void main(String[] args) {
        int size, value, ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        size = sc.nextInt();

        Functions func = new Functions(size);

        while (true) {
            System.out.println("\n=================================");
            System.out.println("         Stack Operations        ");
            System.out.println("=================================");
            System.out.println("---------------");
            System.out.println("|1.| Push     |");
            System.out.println("|2.| Pop      |");
            System.out.println("|3.| Display  |");
            System.out.println("|4.| Exit     |");
            System.out.println("---------------");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter the value to be pushed: ");
                    value = sc.nextInt();
                    func.Push(value);
                    break;
                case 2:
                    func.Pop();
                    break;
                case 3:
                    func.Display();
                    break;
                case 4:
                    System.out.println("Exitting the program. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("invalid choice. please try again.");
            }
        }
    }
}
