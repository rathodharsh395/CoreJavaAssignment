import java.util.Scanner;
public class Method6
{
static float getCircumference(int radius)
{
 return (float)(2*3.14*radius);
}
static float getArea(int radius)
{
 return (float)(3.14*radius*radius);
}

 public static void main(String [] args)
{

 System.out.println("Enter radius:");
 
 Scanner hr= new Scanner(System.in);
 
 int radius = hr.nextInt();
 System.out.println("Circumference:"+Method6.getCircumference(radius)+"\n"
                     +"Area:"+Method6.getArea(radius));
}
}