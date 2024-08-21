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

                System.out.print("Enter the radius of the circle: ");
                radius = sc.nextDouble();
                circleArea = calc.areaCircle(radius);
                System.out.printf("The area of the circle is: %.3f \n", circleArea);

                System.out.print("Enter the length of the rectangle: ");
                length = sc.nextDouble();
                System.out.print("Enter the breadth of the rectangle: ");
                breadth = sc.nextDouble();
                rectangleArea = calc.areaRectangle(length, breadth);
                System.out.printf("The area of the rectangle is: %.3f\n", rectangleArea);

                System.out.print("Enter the base of the triangle: ");
                base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                height = sc.nextDouble();
                triangleArea = calc.areaTriangle(base, height);
                System.out.printf("The area of the triangle is: %.3f\n", triangleArea);
        sc.close();
    }
}
