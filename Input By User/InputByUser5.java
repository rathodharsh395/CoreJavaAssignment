import java.util.Scanner;

public class InputByUser5
{
public static void main(String[] args)
{
System.out.println("Enter side value:");
Scanner sc = new Scanner(System.in);

int side = sc.nextInt();

int area = side*side;
int perimeter = side*4;
System.out.println("Area of Square is: "+area+" "+ "Perimeter of square is: "+ perimeter);

}
}
