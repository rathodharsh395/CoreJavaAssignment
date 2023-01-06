import java.util.Scanner;

public class IfElse1
{
public static void main(String[] args)
{
System.out.println("enter length and breadth:");
Scanner sc = new Scanner(System.in);

int length =sc.nextInt();
int breadth =sc.nextInt();

if(length==breadth)
{
System.out.println("it is a square:");
}
else{
System.out.println("it is not a square:");
}

}}