class SumOfArray {

    public static void main(String[] args) 
    {
        // Initialize an array
        int[] arr = {1, 2, 3, 4, 5};

        // Initialize a variable to store the sum
        int sum = 0;

        // Traverse through the array and add each element to the sum
        for (int element : arr) 
        {
            sum += element;
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}
