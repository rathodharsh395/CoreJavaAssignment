import java.util.Scanner;

public class IfElse4
{
public static void main(String[] args)
{
System.out.println("enter your salary and year of service");

Scanner sc = new Scanner(System.in);
int salary = sc.nextInt();
int service = sc.nextInt();
int bonus = (salary*50)/100;
int total = salary+bonus;

if(service >5)
{
System.out.println("Salary:"+salary);
System.out.println("Bonus:"+bonus);
System.out.println("Total:"+total);
}
else
{
System.out.println("Not applicable for bonus/"+ " "+ "Salary is : "+salary);
}
}
}
