import java.util.Scanner;
public class IfElse13A
{
public static void main(String[] args)
{
System.out.println("Enter 4 digit number= ");   //let 1234
Scanner hr = new Scanner(System.in);
int number = hr.nextInt();


int reversed = 0;

if(number>999 && number<10000)
{
 int fourthDigit = number % 10;                  //4
 reversed = reversed * 10 + fourthDigit;         //0*10+4=4
 number = number/10;                             //123

 int thirdDigit = number % 10;                   //3
 reversed = reversed * 10 + thirdDigit;          //4*10+3=43
 number = number / 10;                           //12

 int secondDigit = number%10;                    //2
 reversed = reversed * 10 + secondDigit;         //43*10+2=432
 number = number / 10;                           //1
  
 reversed = reversed * 10 + number;

 System.out.println("Reversed number =" + reversed);
}
else
{
System.out.println("Invalid Input:");
}

}
}
