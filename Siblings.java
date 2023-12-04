class Siblings 
{
    public static void main(String[] args) 
    {
        Child child1 = new Child("John", "Mary", 3, "Alice", 5);
        Child child2 = new Child("John", "Mary", 3, "Bob", 7);
        Child child3 = new Child("John", "Mary", 3, "Charlie", 3);

        child1.details();
        System.out.println("\n");
        child2.details();
        System.out.println("\n");
        child3.details();
    }
}
class Parent 
{
    private String fatherName;
    private String motherName;
    private int numberOfKids;

    public Parent(String fatherName, String motherName, int numberOfKids)
    {
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.numberOfKids = numberOfKids;
    }

    public void details() 
    {
        System.out.println("Father's name: " + fatherName);
        System.out.println("Mother's name: " + motherName);
        System.out.println("Number of kids: " + numberOfKids);
    }
}

class Child extends Parent 
{
    private String childName;
    private int childAge;

    public Child(String fatherName, String motherName, int numberOfKids, String childName, int childAge) {
        super(fatherName, motherName, numberOfKids);
        this.childName = childName;
        this.childAge = childAge;
    }

    
    public void details() 
    {
        super.details();
        System.out.println("Child's name: " + childName);
        System.out.println("Child's age: " + childAge);
    }
}


