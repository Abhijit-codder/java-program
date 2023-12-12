class NoArgConstructorExample 
{
    // No-arg constructor
    public NoArgConstructorExample() 
    {
        System.out.println("No-arg constructor called");
    }

    public static void main(String[] args) 
    {
        // Creating an object will invoke the no-arg constructor
        NoArgConstructorExample obj = new NoArgConstructorExample();
    }
}

/*class ParameterizedConstructorExample 
{
    // Parameterized constructor
    public ParameterizedConstructorExample(String message) 
    {
        System.out.println("Parameterized constructor called with message: " + message);
    }

    public static void main(String[] args) 
    {
        // Creating an object with a parameter will invoke the parameterized constructor
        ParameterizedConstructorExample obj = new ParameterizedConstructorExample("Hello, World!");
    }
}
*/

/*class DefaultConstructorExample {
    // This class has a default constructor provided by Java

    public static void main(String[] args) {
        // Creating an object will invoke the default constructor
        DefaultConstructorExample obj = new DefaultConstructorExample();
    }
}
*/