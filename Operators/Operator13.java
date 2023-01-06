public class Operator13
{
public static void main(String[] args)
{

int number1 = 12345;

 int number2 = number1%10;  //5
number1 = number1/10;       //1234

int number3 = number1%10;   //4
number1 = number1/10;       //123

int number4= number1%10;    //3
number1 = number1/10;       //12

int number5= number1%10;    //2
number1 = number1/10;       //1

int number6 = number1%10;   //1
number1 = number1/10;       //0

System.out.println(number6 + number3);





}
}