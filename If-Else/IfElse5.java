import java.util.Scanner;
public class IfElse5
{
public static void main(String[] args)
{
System.out.println("Enter Marks:");
Scanner sc = new Scanner(System.in);

int marks = sc.nextInt();
if(marks<25)
{
System.out.println("Grade:"+ 'F');
}

if(marks>=25&&marks<=45)
{
System.out.println("Grade:"+ 'E');
}

if(marks>45&&marks<=50)
{
System.out.println("Grade:"+ 'D');
}

if(marks>50&&marks<=60)
{
System.out.println("Grade:"+ 'C');
}

if(marks>60&&marks<=80)
{
System.out.println("Grade:"+ 'B');
}

if(marks>80)
{
System.out.println("Grade:"+ 'A');
}

}
}