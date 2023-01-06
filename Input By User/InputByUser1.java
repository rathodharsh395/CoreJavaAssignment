import java.util.Scanner;

public class InputByUser1

{
public static void main(String[] args)
{
System.out.println("Please enter two intger:");
Scanner sc = new Scanner(System.in);

int number1 = sc.nextInt();
int number2 = sc.nextInt();

System.out.println("sum:"+( number1+number2));
System.out.println("product:"+( number1*number2));
}
}