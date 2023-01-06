import java.util.Scanner;
 
public class IfElse13B
{
public static void main(String[] args)
{
 Scanner hr = new Scanner(System.in);
 System.out.println("Enter a number = ");

 int number = hr.nextInt();
 int reversed =0;
 
 while (number > 0)
{
 int lastDigit = number % 10;
 reversed = reversed * 10 + lastDigit;
 number = number / 10;
}
System.out.println("Reversed number =" + reversed);

}
}
 

