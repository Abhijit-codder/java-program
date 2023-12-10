 class MathCalculator {
    // Method for addition
        int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method for subtraction
        int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method for multiplication
        int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method for division
        int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
           // return int.NaN; // Return NaN (Not-a-Number) for division by zero
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        MathCalculator  calculator = new MathCalculator();

        // Perform some calculations
        int result1 = calculator.add(10, 5);
        int result2 = calculator.subtract(15, 7);
        int result3 = calculator.multiply(3, 4);
        int result4 = calculator.divide(2, 4);

        // Display the results
        System.out.println("Result of addition: " + result1);
        System.out.println("Result of subtraction: " + result2);
        System.out.println("Result of multiplication: " + result3);
        System.out.println("Result of division: " + result4);
    }
}
