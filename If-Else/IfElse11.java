import java.util.Scanner;
public class IfElse11
{
public static void main(String[] args)
{
 System.out.println("enter year:");
 Scanner hr = new Scanner(System.in);
 
 int year = hr.nextInt();
 if(year%400==0)
 {
  System.out.println(year + ": is a leap year");
 }
  else
  {
    if(year%4 == 0 && year%100 != 0)
      {
        System.out.println(year +": is a leap year");
      }
     else
      {
       System.out.println(year +": is not a leap year");
      }
   }

}
} 
          