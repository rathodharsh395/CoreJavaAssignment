import java.util.Scanner;

public class InputByUser6
{
public static void main(String[] args)
{
 System.out.println("Enter the number:");
 Scanner sc= new Scanner(System.in);
 int number = sc.nextInt();
 
 int square = number*number;
System.out.println("Square of number is:"+ square);
}
}
