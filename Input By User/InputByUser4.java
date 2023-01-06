import java.util.Scanner;
public class InputByUser4
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter Name:");
String name = sc.nextLine();

System.out.println("Enter Roll Number:");
String rollnumber = sc.nextLine();

System.out.println("Enter Interest:");
String interest = sc.nextLine();


System.out.println("Hey, my name is"+" "+name+" "+"and my roll number is"+" "+rollnumber+" "+"My field of interest are"+" "+interest);
}
}
