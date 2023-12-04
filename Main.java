import java.util.Scanner;

class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of shape (rectangle, triangle, circle): ");
        String type = scanner.nextLine();

        double area = 0;

        if (type.equalsIgnoreCase("rectangle")) 
        {
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();

            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            Rectangle rectangle = new Rectangle(length, width);
            area = rectangle.area();
        } 
        else if (type.equalsIgnoreCase("triangle")) 
        {
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();

            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();

            Triangle triangle = new Triangle(base, height);
            area = triangle.area();
        } 
        else if (type.equalsIgnoreCase("circle")) 
        {
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            Circle circle = new Circle(radius);
            area = circle.area();
        } 
        else 
        {
            System.out.println("Invalid shape type");
        }

        System.out.println("The area of the shape is: " + area);
    }
}


class Shape 
{
    private String type;

    public Shape(String type) 
    {
        this.type = type;
    }

    public double area() 
    {
        return 0;
    }
}

class Rectangle extends Shape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    
    public double area() {
        return length * width;
    }
}

class Triangle extends Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() 
    {
        return 0.5 * base * height;
    }
}

class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() 
    {
        return Math.PI * radius * radius;
    }
}

