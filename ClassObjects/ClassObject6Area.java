import java.util.Scanner;
public class ClassObject6Area
{
 int length;
 int breadth;
 public ClassObject6Area(int length,int breadth)
 {
  this.length = length;
  this.breadth = breadth;
 }
 double returnArea()
 {
  return length*breadth;
 }
 public static void main(String [] args)
 {
  System.out.println("Enter length and breadth");
  Scanner hr = new Scanner(System.in);
  int length = hr.nextInt();
  int breadth = hr.nextInt();
  ClassObject6Area a1 = new ClassObject6Area(length,breadth);
  
  System.out.println("Area of Rectangle is :"+ a1.returnArea());
 }
}
  