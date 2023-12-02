import java.util.*;
class Combination 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("num1=");
        int num1=sc.nextInt();
        System.out.println("num2=");
        int num2=sc.nextInt();
        System.out.println("num3=");
        int num3=sc.nextInt();
       // for (num1 = 0; num1 < 3; num1++)
       // {
           // for (num2 = 0; num2< 3; num2++)
          //  {
             //   for (num3 = 0; num3 < 3; num3++)
              //  {
                    if(num1 != num2 && num2 != num3 && num3 != num1)
                    {
                        System.out.println(num1 + "" + num2 + "" + num3);

                    }
                 //}

            //}
    }
}


   