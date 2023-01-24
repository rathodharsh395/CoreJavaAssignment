public class ClassObject4Triangle
{
 int side1,side2,side3;
 String t ;
 public ClassObject4Triangle(int s1,int s2,int s3)
 {
  side1 = s1;
  side2 = s2;
  side3 = s3;
 }
 int getPerimeter()
 {
  return side1+side2+side3;
 }
 double getArea()
 {
  double sp = (side1+side2+side3)/2;
  double area = Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
  return area;
 }
 public static void main(String []args)
 {
  ClassObject4Triangle t1 = new ClassObject4Triangle(3,4,5);
  System.out.println("Perimeter t1:"+ t1.getPerimeter());
  System.out.println("Area t1:"+ t1.getArea());
  
  ClassObject4Triangle t2 = new ClassObject4Triangle(6,7,8);
  System.out.println("Perimeter t2:"+ t2.getPerimeter());
  System.out.println("Area t2:" + t2.getArea());
  
 }
}