class CountEvenOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,12};

        int countEven = 0;
        int countOdd = 0;

        for (int i=0;i<arr.length;i++) {
            int num = arr[i];
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
    }
}
