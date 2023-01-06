 public class Operator14
{
public static void main(String[] args)
{ 
int number1 = 5696;

int number2 = number1%10;        //6
number1 = number1/10;            //569

int number3= number1%10;         //9
number1 = number1/10;            //56

int number4= number1%10;         //6
number1 = number1/10;            //5
           
int number5= number1%10;         //5
number1 = number1/10;            //0

System.out.println((number5+2)+""+(number4+2)+""+(number3+2)+""+(number2+2));
	
}
}
