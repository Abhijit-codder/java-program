import java.util.*;
class prime 
{

	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		int i, number, count; 
		
		System.out.println(" enter value for n for prime: ");	
        int n=sc.nextInt();
		for(number = 1; number <= n; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}