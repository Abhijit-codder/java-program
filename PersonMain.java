 class PersonMain {
    public static void main(String[] args) {
        // Example usage for Student class
        Student student = new Student("John Doe", 20, 12345, 85.5);
        student.displayStudentDetails();

        System.out.println();

        // Example usage for Employee class
        Employee employee = new Employee("Jane Smith", 30, "IT", 50000.0);
        employee.displayEmployeeDetails();
    }
}


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private int sapId;
    private double result;

    public Student(String name, int age, int sapId, double result) {
        super(name, age);
        this.sapId = sapId;
        this.result = result;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("SAP ID: " + sapId);
        System.out.println("Result: " + result);
    }
}

class Employee extends Person {
    private String department;
    private double grossSalary;

    public Employee(String name, int age, String department, double grossSalary) {
        super(name, age);
        this.department = department;
        this.grossSalary = grossSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

   