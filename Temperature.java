import java.util.*;
class Temperature
{
    double celsius;
    void fahrenheit(double celsius)
    {
        double fahrenheit=((9/5)*celsius)+32;
        System.out.println("the temperature in fahrenheit:"+fahrenheit);

    }
    void kelvin(double celsius)
    {
        double kelvin=celsius+273.15;
        System.out.println("The temperature in kelvin:"+kelvin);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter celsius:");
        Temperature temp=new Temperature();
        double celsius=sc.nextDouble();
        temp.fahrenheit(celsius);
        temp.kelvin(celsius);

    }
}