import java.util.Scanner;
public class Salary
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your salary=");
float sal=sc.nextFlaot();
float house_rent=sal+(15/100*sal);
float allowance=sal+(20/100*sal);
float travel=sal+1000;
float ttlsal=sal+house_rent+allowance+travel;
System.out.println("The gross salary="+ttlsal);
}
}


