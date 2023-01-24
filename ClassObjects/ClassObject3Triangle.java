// import java.lang.Math;
public class ClassObject3Triangle
{
int side1;
int side2;
int side3;

int getPerimeter()
{
 return side1+side2+side3;
}

 double getArea()
{
 double s = 0.5*side1+side2+side3;
 double area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
 return area;
}

 public static void main(String [] args)
{
 ClassObject3Triangle re = new ClassObject3Triangle();
 re.side1 = 3;
 re.side2 = 4;
 re.side3 = 5;

 System.out.println("Perimeter of triagle:"+ re.getPerimeter());
 System.out.println("Area of triangle:"+ re.getArea());

}
}