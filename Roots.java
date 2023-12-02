import java.util.*;
class Roots
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a,b,c");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=(b*b)-4*a*c;
if(d>0)
{
System.out.println("Real Roots");
int r=(-b+(d)^(1/2))/2*a;
int s=(-b-(d)^(1/2))/2*a;
System.out.println("The real roots are="+r);
System.out.println("The real roots are="+s);
}
else
{
System.out.println("Not a Real Roots");
}
}
}




