import java.util.Scanner;
public class Method7
{ 
 
 static boolean  getPrime(int number)
 {
  boolean isPrime = true;
  for(int i=2;i<=number/2;i++)
    { 
      if(number%i==0)
         {
         return false;
         }
     }
    return isPrime;
      }
  public static void main(String [] args)
  {
   System.out.println("Enter number to check prime:");

   Scanner hr = new Scanner(System.in);
   int number = hr.nextInt();
   System.out.println("Number is Prime:"+getPrime(number));
 


 } 
}