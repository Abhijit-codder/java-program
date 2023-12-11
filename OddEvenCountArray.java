import java.util.*;
class OddEvenCountArray {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter elements:");
            arr[i]=sc.nextInt();
        }

        int countEven = 0;
        int countOdd = 0;

       for(int element:arr)
       {
           if(element % 2==0)
           {
               countEven++;
           }
           else
           {
               countOdd++;
           }
       }

        System.out.println("Number of even numbers: " + countEven);
        System.out.println("Number of odd numbers: " + countOdd);
    }
}