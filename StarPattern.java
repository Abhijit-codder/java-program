
import java.util.*; 

class StarPattern 
{ 
	
	public static void main(String args[])
	{ 
        Scanner sc=new Scanner(System.in);
       
		int i, j ; 
        System.out.println("enter value of n");
        int n=sc.nextInt();
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= i; j++) 
            { 
				System.out.print("*"); 
			} 

			// printing new line for each row 
			System.out.println(); 
		} 
	} 

	
}

