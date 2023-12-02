import java.util.*;
class WithThirdVariable
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
a=c-a;
b=c-a;
System.out.println("after swapping a="+a);
System.out.println("after swapping b="+b);
}
}


