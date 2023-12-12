// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }

    void wagTail() {
        System.out.println("Tail wagging");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    void scratch() {
        System.out.println("Cat scratching");
    }
}

    class InheritancePolymorphismExample {
    public static void main(String[] args) {
        // Polymorphism with Animal reference
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();  // Calls Dog's makeSound method
        // myDog.wagTail();  // This is not allowed because the reference type is Animal, not Dog

        myCat.makeSound();  // Calls Cat's makeSound method
        // myCat.scratch();  // This is not allowed because the reference type is Animal, not Cat

        // Direct instantiation without polymorphism
        Dog specificDog = new Dog();
        Cat specificCat = new Cat();

        specificDog.makeSound();  // Calls Dog's makeSound method
        specificDog.wagTail();    // Calls Dog's specific method

        specificCat.makeSound();  // Calls Cat's makeSound method
        specificCat.scratch();    // Calls Cat's specific method
    }
}
