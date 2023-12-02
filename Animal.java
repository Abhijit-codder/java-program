public class Animal 
{
  private String name;

  public Animal(String name) 
  {
    this.name = name;
  }

  public String getName() 
  {
    return name;
  }
}

class Dog extends Animal 
{
  public Dog(String name) 
  {
    super(name);
  }

  public void printName() 
  {
    System.out.println(name); // Cannot access private member 'name' from derived class
  }
}

class Main {
  public static void main(String[] args) 
  {
    Dog dog = new Dog("Tommy");
    dog.printName(); // Compilation error
  }
}
