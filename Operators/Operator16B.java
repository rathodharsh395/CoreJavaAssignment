public class Operator16B
{
public static void main(String[] args)
{
 int number = 123;
 int reversed = 0;

 int lastDigit = number%10;
 reversed = reversed * 10+ lastDigit;
 number = number/10;

 int secondlastDigit = number%10;
 reversed = reversed * 10+ secondlastDigit;
 number = number/10;
 
 reversed = reversed * 10+ number;
 
 System.out.println(reversed);
}
}
 