import java.util.Scanner;

public class ClassObject1Area
{
 int recLength;
 int recBreadth;

public static void main(String[] arga)
 {
 Scanner hr = new Scanner(System.in);
 System.out.println("Enter length and breadth");

 int length = hr.nextInt();
 int breadth = hr.nextInt();

 ClassObject1Area re = new ClassObject1Area();
 re.setDim(length,breadth);
 System.out.println("Area: "+re.getArea());
 }

 void setDim(int Length, int Breadth)
  {
   recLength = Length;
   recBreadth = Breadth;
  }
 int getArea()
   {
     return recLength*recBreadth;
   }

}