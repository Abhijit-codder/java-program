import java.util.Scanner;

class Shape {
    private String type;

    // Default constructor
    public Shape() {
        System.out.println("Welcome to the Shape Calculator!");
    }

    // Parameterized constructor for rectangle
    public Shape(String type, int length, int breadth) {
        this.type = type;
        calculateRectangleArea(length, breadth);
    }

    // Parameterized constructor for circle
    public Shape(String type, double radius) {
        this.type = type;
        calculateCircleArea(radius);
    }

    private void calculateRectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of " + type + " (Rectangle): " + area);
    }

    private void calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of " + type + " (Circle): " + area);
    }
}

class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Default constructor
        Shape defaultShape = new Shape();

        // Rectangle input
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        Shape rectangle = new Shape("Rectangle", length, breadth);

        // Circle input
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Shape("Circle", radius);

        scanner.close();
    }
}
