public class Operator15
{
public static void main(String[] args)
{
float number1 = 132;

float number2 = number1%10;            //2
number1 = number1/10;                  //13

float number3 = number1%10;            //3
number1 = number1/10;                  //1

float number4 = number1%10;            //1
number1 = number1/10;                  //0


System.out.println("Sum of digit is:"+(int)(number4+number3+number2));


}
}