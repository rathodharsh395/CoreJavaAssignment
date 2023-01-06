import java.util.Scanner;
public class IfElse3
{
public static void main(String[] args)
{
System.out.println("Ask for quantity");
Scanner sc = new Scanner(System.in);

float quantity =sc.nextFloat();

 float unitCost = 100;
float totalAmount = unitCost*quantity;
float discount = (totalAmount*10)/100;
float payableAmount = totalAmount - discount;
if(totalAmount>1000)
{
System.out.println("Total Amount:"+totalAmount);
System.out.println("Discount:"+ discount);
System.out.println("Payable Amount"+ payableAmount);
}
else
{
System.out.println("Total Amount:"+totalAmount);
}

}
}
