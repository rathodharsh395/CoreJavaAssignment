import java.util.Scanner;
public class IfElse6
{
public static void main(String[] args)
{
 System.out.println("Enter age of three people:");

 Scanner sc = new Scanner(System.in);
  int firstAge = sc.nextInt();
  int secondAge = sc.nextInt();
  int thirdAge = sc.nextInt();
 // For Oldest  
  if(firstAge>secondAge&&firstAge>thirdAge)
   {
    System.out.println(firstAge + " is oldest");
   }
  
  else
  {
    if(secondAge>firstAge&&secondAge>thirdAge)
      {
       System.out.println(secondAge + " is oldest");
      }
     else
     {
       System.out.println(thirdAge + " is oldest");
     }
   }
   
 // For Youngest
  
    if(firstAge<secondAge&&firstAge<thirdAge)
   {
    System.out.println(firstAge + " is youngest");
   }
  
  else
  {
    if(secondAge<firstAge&&secondAge<thirdAge)
      {
       System.out.println(secondAge + " is youngest");
      }
     else
     {
       System.out.println(thirdAge + " is youngest");
     }
   }
}
}