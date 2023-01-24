import java.util.Scanner;
public class Method3
{
String eligible = "eligible";

public static void main(String [] args)
{ 
Scanner hr = new Scanner(System.in);
System.out.println("Enter Your Age:");
 int age = hr.nextInt();
 Method3 re = new Method3();
 System.out.println("You are "+re.voteEligibility(age)+" to vote");
  
}
 
 String voteEligibility(int age){
  if(age<18){
   eligible = "Not eligible";
   }
  return eligible;
 }
}
     