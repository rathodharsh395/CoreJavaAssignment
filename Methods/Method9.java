import java.util.Scanner;
public class Method9
{
 int fact = 1;
 int factorial(int number){
   for(int i=1;i<=number;i++){
     fact *= i;
    } 
 return fact;
 }
 public static void main(String [] args)
 { 
  System.out.println("Enter number:");

  Scanner hr = new Scanner(System.in);
  int number = hr.nextInt();
  Method9 re= new Method9();
  re.factorial(number);
  System.out.println("Factorial:"+re.fact);
  }
}