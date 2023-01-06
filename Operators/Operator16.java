public class Operator16
{
public static void main(String[]args)
{ 
int number1 =132;

int number2 = number1%10;   //2
number1 = number1/10;         //13

int number3 = number1%10;   //3
number1 = number1/10;         //1

int number4 = number1%10;   //1
number1 = number1/10;         //0

System.out.print(number2);
System.out.print(number3);
System.out.print(number4);
}
}

