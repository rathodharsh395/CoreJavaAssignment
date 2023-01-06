import java.util.Scanner;
public class InputByUser9
{
public static void main(String[] args)
{
System.out.println("Enter values of 'a' and 'b' :");
Scanner sc = new Scanner(System.in);

int a= sc.nextInt();
int b= sc.nextInt();

System.out.println(a<50 && a<b);
}
}