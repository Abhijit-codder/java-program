import java.util.Scanner;
class Student
{
    int roll,mark1,mark2,mark3;
    Student (int roll,int mark1,int mark2,int mark3)
    {
    this.roll=roll;
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
        
    }
    double avg()
    {
        return (mark1+mark2+mark3)/3.0;
        
    }
    double display()
    {
        double average=avg();
        if(mark1<35||mark2<35||mark3<35)
        {
            System.out.println("roll-no"+roll);
            System.out.println("fail");
            
        }
        else
        {
            System.out.println("roll-no"+roll);
            System.out.println("average"+average);
            
        }
        return avg();
        
    }
    

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter roll");
        int roll=scanner.nextInt();
        System.out.println("enter mark1");
        int mark1=scanner.nextInt();
        System.out.println("enter mark2");
        int mark2=scanner.nextInt();
        System.out.println("enter mark3");
        int mark3=scanner.nextInt();
        
        Student stu=new Student(roll,mark1,mark2,mark3);
        stu.display();
    }
}

