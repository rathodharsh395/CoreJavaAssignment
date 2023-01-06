import java.util.Scanner;
public class Loop21
{
public static void main(String[] args)
{ 
Scanner hr = new Scanner(System.in);
System.out.println("enter the number upto which you want sum:");
int range = hr.nextInt();
int sum =0;
for(int i=0;i<=range;i++)
{
 sum += i;
}
System.out.println(sum);
}
}
 