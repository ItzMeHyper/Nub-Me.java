import java.util.Scanner;

class MethodOverloading {
    double areaCircle(double radius) {
        return 3.14 * radius * radius;
    }
    double areaRectangle(double length, double breadth) {
        return length * breadth;
    }
    double areaTriangle(double base, double height) {
        return (base * height) / 2.0;
    }
}

public class areaofdiffshapesv2 {
    public static void main(String[] args) {
        double radius, circleArea, length, breadth, rectangleArea, base, height, triangleArea;

        Scanner sc = new Scanner(System.in);
        MethodOverloading calc = new MethodOverloading();

        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                radius = sc.nextDouble();
                circleArea = calc.areaCircle(radius);
                System.out.printf("The area of the circle is: %.3f ", circleArea);
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                length = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                breadth = sc.nextDouble();
                rectangleArea = calc.areaRectangle(length, breadth);
                System.out.printf("The area of the rectangle is: %.3f", rectangleArea);
                break;

            case 3:
                System.out.print("Enter the base of the triangle: ");
                base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                height = sc.nextDouble();
                triangleArea = calc.areaTriangle(base, height);
                System.out.printf("The area of the triangle is: %.3f", triangleArea);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }
        sc.close();
    }
}

