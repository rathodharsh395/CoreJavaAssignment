import java.util.Scanner;
public class Loop25
{
public static void main(String[]args)
{
Scanner hr= new Scanner(System.in);

System.out.println("Enter Numerator:");
float numerator = hr.nextFloat();

System.out.println("Enter Denominator:");
float denominator = hr.nextFloat();

float i = 0f;

if(denominator<=numerator && denominator!=0)
{
  for( i=0;denominator<=numerator;i++)
  {
   numerator = numerator - denominator;
  }
  System.out.println("Quotinet: "+i+" remainder: "+numerator);
}
else
{
  if(denominator>numerator)
   { 
    System.out.println("Quotient: 0"+" remainder: "+numerator);
   }
  else
   {
    System.out.println("Quotient: Infinity  remainder : NaN");
    }
}

}
}
