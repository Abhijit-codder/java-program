import java.util.*;
class UpperString 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string to convert to upper case:");
        String str=sc.nextLine();
        String str2=str.toUpperCase();
        String str3=str.toLowerCase();

        System.out.println("the upper case string is:"+str2);
        System.out.println("the lower case string is:"+str3);
    }

    
}
