import java.util.Scanner;

public class InputByUser2
{
public static void main(String[] args)
{ 
System.out.println("Enter two integer");
Scanner sc = new Scanner(System.in);

int number1 = sc.nextInt();
int number2 = sc.nextInt();
 
int sum = number1 + number2;
int product = number1*number2;
System.out.println("sum =" + sum +"   "+"Product="+ product);

}
}