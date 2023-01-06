import java.util.Scanner;
public class InputByUser8
{
public static void main(String[] args)
{
System.out.println("Give three inputs:");
Scanner sc= new Scanner(System.in);

char input1 = sc.next().charAt(0);
char input2 = sc.next().charAt(0);
char input3 = sc.next().charAt(0);

boolean allAreEqual = input1==input2&&input1==input3;

boolean anyTwoEqual = (input1==input2)||(input1==input3)||(input2==input3);

System.out.println("All are equal:"+ allAreEqual);
System.out.println("Any two are equal:"+ anyTwoEqual);
}
}