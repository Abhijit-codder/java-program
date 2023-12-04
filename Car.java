// Abstract class Car
abstract class Car 
{
    // Abstract methods
    abstract void specification();
    abstract void finalPrice();
    
    // Public method
    public void display() 
    {
        System.out.println("Welcome to the Car Showroom!");
    }
}

// Subclass XUV
class XUV extends Car 
{
    
    void specification() 
    {
        System.out.println("XUV Specifications: SUV type, spacious interior, and powerful engine.");
    }

    
    void finalPrice() 
    {
        System.out.println("XUV Final Price: $30,000");
    }
}

// Subclass SportsCar
class SportsCar extends Car 
{
    
    void specification() 
    {
        System.out.println("Sports Car Specifications: Aerodynamic design, high-speed capabilities.");
    }

    
    void finalPrice() 
    {
        System.out.println("Sports Car Final Price: $100,000");
    }
}

// Main class
class CarShowroom 
{
    public static void main(String[] args) 
    {
        // Example for XUV
        Car xuvCar = new XUV();
        xuvCar.display();
        xuvCar.specification();
        xuvCar.finalPrice();

        System.out.println();

        // Example for SportsCar
        Car sportsCar = new SportsCar();
        sportsCar.display();
        sportsCar.specification();
        sportsCar.finalPrice();
    }
}
