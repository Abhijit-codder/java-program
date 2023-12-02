import java.util.*;
class SmallestLargest 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1,num2,num3");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
            System.out.println("Num1 is largest");

        }
        else if(num2>num1 && num2>num3)
        {
            System.out.println("Num2 is largest");

        }
        else
        {
            System.out.println("Num3 is largest");

        }

    }
    
}
