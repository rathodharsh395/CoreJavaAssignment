import java.util.Scanner;
public class IfElse8
{
public static void main(String[] args)
{
System.out.println("Enter the number of class held and attended:");
Scanner hr = new Scanner(System.in);

double held = hr.nextInt();
double attended = hr.nextInt();

double percentage = attended*100/held;
if(percentage>=75)
{
System.out.println("attendence is: "+ percentage+"% you are allowed to sit for exam");
}
else
{
System.out.println("attendence is: "+ percentage+"% you are not allowed to sit for exam");
}

}
}