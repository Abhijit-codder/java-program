//to find the specified word from the string
import java.util.*;
class CountWordString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence to count word:");
        String sent=sc.nextLine();
        System.out.println("Enter word to find:");
        String word=sc.nextLine();

        String temp[]=sent.split(" ");
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            if(word.equals(temp[i]))

            {
                count++;

            }
        }
        System.out.println("the sent is:"+sent);
        System.out.println("the word is:"+word);
        System.out.println("number of search word present:"+count);
        

        

    }
    
}
