import java.util.Scanner;

public class InputByUser3
{
public static void main(String[] args)
{
System.out.println("Give the length and breadth of Rectangle:");

Scanner sc = new Scanner(System.in);

double length = sc.nextDouble();

double breadth = sc.nextDouble();

int area = (int)(length*breadth);
System.out.println("Area of Rectangle is:"+ area);

}
}
