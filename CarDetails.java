class Vehicle 
{
    private String name;
    private String brand;
    private String model;
    private int year;
    private int mileage;

    public Vehicle(String name, String brand, String model, int year, int mileage) 
    {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getName() 
    {
        return name;
    }

    public String getBrand() 
    {
        return brand;
    }

    public String getModel() 
    {
        return model;
    }

    public int getYear() 
    {
        return year;
    }

    public int getMileage() 
    {
        return mileage;
    }
}

class Car extends Vehicle 
{
    private String type;
    private double price;
    private double discount;

    public Car(String name, String brand, String model, int year, int mileage, String type, double price, double discount) 
    {
        super(name, brand, model, year, mileage);
        this.type = type;
        this.price = price;
        this.discount = discount;
    }

    public String getType() 
    {
        return type;
    }

    public double getPrice() 
    {
        return price;
    }

    public double getDiscount() 
    {
        return discount;
    }

    public double calculateFinalPrice() 
    {
        return price - discount;
    }

    public void displayDetails() 
    {
        System.out.println("Vehicle Details:");
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Year: " + getYear());
        System.out.println("Mileage: " + getMileage());
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

class CarDetails 
{
    public static void main(String[] args) 
    {
        Car car = new Car("Honda", "Civic", "EX", 2023, 10000, "Sedan", 25000, 2000);
        car.displayDetails();
    }
}
