import java.util.*;
class StringOccurence 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("entter the string=");
        String enter=sc.nextLine();
        int firstIndex=enter.indexOf('i');
       System.out.println("first occurrence of char 'i' is" + " found at : " + firstIndex); 
        int lastIndex = enter.lastIndexOf('i'); 
		System.out.println("Last occurrence of char 'i' is" + " found at : " + lastIndex); 

    }
}
 