import java.util.Scanner;
public class Loop16
{
public static void main(String [] args)
{
Scanner hr= new Scanner(System.in);
System.out.println("Enter a number:");
int number = hr.nextInt();
int sumOfEvenDigits = 0;
int sumOfOddDigits = 0;
while(number>0)
{
 int lastDigit = number%10;
 if(lastDigit%2==0)
  {
    sumOfEvenDigits += lastDigit;
  }
 else
 {
  sumOfOddDigits += lastDigit;
 }
 
 number /= 10;
}
System.out.println("Sum of Even digits:"+sumOfEvenDigits);
System.out.println("Sum of Odd digits:"+sumOfOddDigits);

}
}
 	