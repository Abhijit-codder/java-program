import java.util.*;
class Seat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Dear Passenger enter Your seat Number");
int seat_no=sc.nextInt();
int berth=seat_no%8;
switch(berth)
{
case 1:System.out.println("lower");
break;
case 2:System.out.println("Middle");
break;
case 3:case 6:System.out.println("Upper"); //multiple cases
break;
case 4:System.out.println("lower");
break;
case 5:System.out.println("Middle");
break;
//case 6:System.out.println("Upper");
//break;
case 7:System.out.println("side-lower");
break;
case 0:System.out.println("side-upper");
break;
default:System.out.println("Re-enter please");
}
}
}
