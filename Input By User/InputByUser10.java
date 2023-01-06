import java.util.Scanner;
public class InputByUser10
{
public static void main(String[] args)
{
System.out.println("Enter marks of Robert in three subjects");
Scanner sc= new Scanner(System.in);

int subject1 = sc.nextInt();
int subject2 = sc.nextInt();
int subject3 = sc.nextInt();

int totalMarks = subject1+subject2+subject3;
int percentage = totalMarks*100/300;

System.out.println("Total marks:"+ totalMarks);
System.out.println("Percentage:"+ percentage);

}
}
