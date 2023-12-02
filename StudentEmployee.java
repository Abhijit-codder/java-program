import java.util.Scanner;

class Person {
    String name;
    int age;

    // Constructor to take personal details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int sapId;
    double result;

    // Constructor for Student
    public Student(String name, int age, int sapId, double result) {
        super(name, age);
        this.sapId = sapId;
        this.result = result;
    }

    // Method to calculate and print student details
    public void calculateResult() {
        System.out.println("Student Name: " + name);
        System.out.println("SAP ID: " + sapId);
        System.out.println("Result: " + result);
    }
}

class Employee extends Person {
    String department;
    double salary;

    // Constructor for Employee
    public Employee(String name, int age, String department, double salary) {
        super(name, age);
        this.department = department;
        this.salary = salary;
    }

    // Method to calculate and print employee details
    public void calculateGrossSalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Gross Salary: " + salary);
    }
}

class StudentEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Student
        System.out.print("Enter Student details:\nName: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        System.out.print("SAP ID: ");
        int sapId = scanner.nextInt();
        System.out.print("Result: ");
        double result = scanner.nextDouble();

        // Creating Student object
        Student student = new Student(studentName, studentAge, sapId, result);

        // Input for Employee
        System.out.print("\nEnter Employee details:\nName: ");
        scanner.nextLine();
        String employeeName = scanner.nextLine();
        System.out.print("Age: ");
        int employeeAge = scanner.nextInt();
        System.out.print("Department: ");
        scanner.nextLine();
        String department = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        // Creating Employee object
        Employee employee = new Employee(employeeName, employeeAge, department, salary);

        // Calculating and printing results
        student.calculateResult();
        System.out.println("\n---------------------------\n");
        employee.calculateGrossSalary();

        scanner.close();
    }
}
