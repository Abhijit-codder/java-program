import java.util.*;
class digits 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n:");
        n=sc.nextInt();
        int quotient=n/10;
        int remainder=n%10;
        System.out.println(quotient);
        System.out.println(remainder);
    }
}