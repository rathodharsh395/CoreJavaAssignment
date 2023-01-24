import java.util.Scanner;
public class ClassObject7Area
{
 Scanner hr = new Scanner(System.in);
 int num1 = hr.nextInt();
 int num2 = hr.nextInt();
 int num3 = hr.nextInt();
 
public static void main(String []args)
{
  ClassObject7Area re = new ClassObject7Area();
  int average = (re.num1+re.num2+re.num3)/3;
  System.out.println("Average:"+average);
}
}
