import java.util.*;
class NumberPattern 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the value:");
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }


    }
    
}
