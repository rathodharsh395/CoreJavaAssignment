public class ClassObject5Rectangle
{
 int length;
 int breadth;
 ClassObject5Rectangle(int l , int b)
 {
  length = l ;
  breadth = b ;
 }
 double Area()
 { 
  return length*breadth;
 }
 
 public static void main(String []args)
 {
 ClassObject5Rectangle r1 = new ClassObject5Rectangle(4,5);
 System.out.println("Area of Rec1: "+ r1.Area());
 
 ClassObject5Rectangle r2 = new ClassObject5Rectangle(5,8);
 System.out.println("Area of Rec2: "+ r2.Area());
 }
}
