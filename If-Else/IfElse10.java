import java.util.Scanner;
public class IfElse10
{
public static void main(String[] args)
{
 System.out.println("Enter values of x, y, z respectively:");
 Scanner hr = new Scanner(System.in);

 int x = hr.nextInt();
 int y = hr.nextInt();
 int z = hr.nextInt();
  
 System.out.println(x == 2);                //true
 System.out.println(x != 5);                //true
 System.out.println(x != 5 && y >= 5);      //true
 System.out.println(z != 0 || x == 2);      //true 
 System.out.println(!(y<10));               //false

 }
 }