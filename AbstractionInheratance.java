// Abstract class at the top of the hierarchy
abstract class Shape {
    abstract void draw(); // Abstract method to be implemented by subclasses
}

// First level of inheritance
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    void circleSpecificMethod() {
        System.out.println("Additional method specific to Circle");
    }
}

// Second level of inheritance
class ColoredCircle extends Circle {
    @Override
    void draw() {
        System.out.println("Drawing Colored Circle");
    }

    void coloredCircleSpecificMethod() {
        System.out.println("Additional method specific to ColoredCircle");
    }
}

public class AbstractionInheratance {
    public static void main(String[] args) {
        // Create objects and demonstrate multilevel inheritance
        Shape shape = new ColoredCircle(); // Upcasting
        shape.draw(); // Calls draw() of ColoredCircle
        // shape.coloredCircleSpecificMethod(); // This is not allowed, as it's not part of the Shape interface

        ColoredCircle coloredCircle = new ColoredCircle();
        coloredCircle.draw(); // Calls draw() of ColoredCircle
        coloredCircle.coloredCircleSpecificMethod(); // Calls method specific to ColoredCircle

        Circle circle = new Circle();
        circle.draw(); // Calls draw() of Circle
        circle.circleSpecificMethod(); // Calls method specific to Circle
    }
}
