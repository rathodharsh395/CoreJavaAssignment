import java.util.Scanner;

public class IfElse2
{
public static void main(String[] args)
{
System.out.println("enter two values");
Scanner scanner = new Scanner(System.in);
int number1= scanner.nextInt();
int number2= scanner.nextInt();

if(number1>number2)
{
System.out.println("greatest no. is:"+ number1);
}
else
{
System.out.println("greatest no.is:"+ number2);

}

}
}

