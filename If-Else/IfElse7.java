import java.util.Scanner;
public class IfElse7
{
public static void main(String[] args)
{
System.out.println("enter any value:");
Scanner hr = new Scanner(System.in);

double absolute = hr.nextDouble();

if(absolute<0)
{
System.out.println("absolute value is:" + -absolute);
}
else
{
System.out.println("absolute value is:" + absolute);
}

}
}


