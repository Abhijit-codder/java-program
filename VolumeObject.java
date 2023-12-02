import java.util.Scanner;
class ShapeCalculator {
   static double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

   static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    static double calculateCubeVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }

   static double calculateConeVolume(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCalculator sh=new ShapeCalculator();

        while (true) {
            System.out.println("Choose a shape:");
            System.out.println("1. Sphere");
            System.out.println("2. Cylinder");
            System.out.println("3. Cube");
            System.out.println("4. Cone");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            double volume = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    volume = sh.calculateSphereVolume(sphereRadius);
                    break;
                case 2:
                    System.out.print("Enter the radius of the cylinder: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double cylinderHeight = scanner.nextDouble();
                    volume = sh.calculateCylinderVolume(cylinderRadius, cylinderHeight);
                    break;
                case 3:
                    System.out.print("Enter the side length of the cube: ");
                    double cubeSideLength = scanner.nextDouble();
                    volume = sh.calculateCubeVolume(cubeSideLength);
                    break;
                case 4:
                    System.out.print("Enter the radius of the cone: ");
                    double coneRadius = scanner.nextDouble();
                    System.out.print("Enter the height of the cone: ");
                    double coneHeight = scanner.nextDouble();
                    volume = sh.calculateConeVolume(coneRadius, coneHeight);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            System.out.println("The volume of the selected shape is: " + volume);
        }

        scanner.close();
    }
}
