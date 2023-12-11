 class ParentChild {
    public static void main(String[] args) {
        // Creating objects for each child
        Child child1 = new Child("John Sr.", "Mary", 3, "John Jr.", 10);
        Child child2 = new Child("Mike", "Susan", 2, "Emma", 8);

        // Printing details for each child
        System.out.println("Details for Child 1:");
        child1.details();
        System.out.println();

        System.out.println("Details for Child 2:");
        child2.details();
    }
}

class Parent {
    private String fatherName;
    private String motherName;
    private int numberOfKids;

    public Parent(String fatherName, String motherName, int numberOfKids) {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.numberOfKids = numberOfKids;
    }

    public void details() {
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Number of Kids: " + numberOfKids);
    }
}

class Child extends Parent {
    private String childName;
    private int age;

    public Child(String fatherName, String motherName, int numberOfKids, String childName, int age) {
        super(fatherName, motherName, numberOfKids);
        this.childName = childName;
        this.age = age;
    }

    @Override
    public void details() {
        super.details(); // Call the details() method of the parent class
        System.out.println("Child's Name: " + childName);
        System.out.println("Child's Age: " + age);
        //System.out.println("Number of Siblings: " + numberOfKids);
    }
}

   
