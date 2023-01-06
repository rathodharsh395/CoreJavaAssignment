import java.util.Scanner;
public class Loop7
{
public static void main(String[] args)
{
Scanner hr = new Scanner(System.in);
System.out.println("enter number to find factorial:");
int number = hr.nextInt();
int factorial= 1 ;

 for(int i=1;i<=number;i++)
  { 
    factorial *= i ;
   }

   System.out.println("Factorial:"+ factorial);
}
} 
  