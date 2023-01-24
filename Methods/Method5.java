import java.util.Scanner;
public class Method5
{
int getProduct(int num1,int num2){
 return num1*num2;
}
public static void main(String [] args)
{ 
Method5 re = new Method5();
System.out.println("Enter two number:");

Scanner hr = new Scanner(System.in);


int number1 = hr.nextInt();
int number2 = hr.nextInt();

System.out.println("Product:"+re.getProduct(number1,number2));
}
}