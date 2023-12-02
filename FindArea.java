class Rectangle
{    
    int length;   //variables declaration 
    int breadth;

    void getdata(int x,int y) //method definition
   {
      length=x;
      breadth=y;
   }
    int rectArea()   //method definition 2
   {
       int area=length*breadth;
       return(area);
   }
}
class FindArea   //main method class
{
    public static void main(String args[])
    {
        int area1,area2;
        Rectangle rect1=new Rectangle();   //creating objects
        Rectangle rect2=new Rectangle();
        rect1.length=4;     //variables accessing
        rect1.breadth=10;
        area1=rect1.length*rect1.breadth;
        rect2.getdata(5,7);     //acccessing methods
        area2=rect2.rectArea();
        System.out.println("area of rect 1="+area1);
        System.out.println("area of rect 2="+area2);
        
        
        
        
    }
}
    
    
                                            
   

