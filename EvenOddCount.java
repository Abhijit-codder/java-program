class EvenOddCount {

    public static void main(String[] args) {
        // Initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Initialize variables to count even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Traverse through the array and count even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts of even and odd numbers
        System.out.println("The number of even numbers is: " + evenCount);
        System.out.println("The number of odd numbers is: " + oddCount);
    }
}
