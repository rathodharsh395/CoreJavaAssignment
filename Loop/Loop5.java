import java.util.Scanner;

public class Loop5
{
public static void main(String[] args)
{
System.out.println("Enter the number for which you want table");
Scanner hr = new Scanner(System.in);
int number = hr.nextInt();

for(int i=1;i<=10;i++)
{
 System.out.println(number*i);

}

}
}