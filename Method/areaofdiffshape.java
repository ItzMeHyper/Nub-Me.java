class MethodOverloading {
    void areaCircle(double radius) {
        System.out.println("The area of the circle is: " +(3.14*radius*radius));
    }
    void areaRectangle(double length, double breadth) {
        System.out.println("The area of the rectangle is: " +(length*breadth));
    }
    void areaTriangle(double base, double height) {
        System.out.println("The area of the triangle is: " +((base * height) / 2.0));
    }
}

public class areaofdiffshape {
    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();
        
        calc.areaCircle(1.5);
        calc.areaRectangle(10, 8);
        calc.areaTriangle(2.5, 3.3);
    }
}
