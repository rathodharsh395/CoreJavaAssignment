import java.util.Scanner;
public class Loop18
{
public static void main(String[] args)
{
Scanner hr= new Scanner(System.in);
System.out.println("enter first and last number of range you want to print:");
int first = hr.nextInt();
int last = hr.nextInt();

 for(int i = first;i<=last;i++)
 {
  System.out.println(i);
}
}
}