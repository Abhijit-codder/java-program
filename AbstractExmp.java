import java.util.*;
abstract class abstractProgram 
{
    abstract void personalinfo();

    void salary(int sal)
    {
        int sum=sal+10;
        System.out.println(sum);


    }
    void display()
    {
        System.out.println("Here is you details:");
    }

}
class person extends abstractProgram
{
    void personalinfo()
    
    {
        String name="rohan";
        int age=20;
        System.out.println(name);
        System.out.println(age);
       
    }

}
class AbstractExmp{
    public static void main(String args[])
    {
        Scanner sc=new Scanner("System.in");
        abstractProgram personal=new person();
        personal.display();
        personal.salary(100);
        personal.personalinfo();
      
    }
}
