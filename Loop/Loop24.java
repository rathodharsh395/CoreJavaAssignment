import java.util.Scanner;
public class Loop24
{
public static void main(String[] args)
{
Scanner hr = new Scanner(System.in);
System.out.println("enter two numbers to get product:");
int first = hr.nextInt();
int second = hr.nextInt();
int product = 0;

 for(int i=1;i<=second;i++)
  {
    product = product + first;
   }


System.out.println(product);


}
}