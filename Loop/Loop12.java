import java.util.Scanner;
public class Loop12
{
public static void main(String[] args)
{
 Scanner hr = new Scanner(System.in);
 System.out.println("Enter the Number:");
 int number = hr.nextInt(); ///12345
 int sum = 0;
 int digit = 0;
 while(number>=1)
  { 
    digit = number%10;    // 12345%10=5 : 1234 
    sum = sum + digit ;   // 0+5= 5 : 5+4=9 : 9+3=12 : 12+2=14 : 14+1=15
    number = number/10;   // 12345/10=1234 :
  }

 System.out.println("Sum of Digit is:" + sum);

}
}