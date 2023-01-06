import java.util.Scanner;           //A perfect number is a positive integer that is equal to the sum of its positive divisorl,excluding the number itself.
public class Loop23
{
public static void main(String[] args)
{
Scanner hr= new Scanner(System.in);
System.out.println("Enter number to check perfect or not:");
int number = hr.nextInt();

int sum = 0;
for(int i=1;i<=number/2;i++)
{
   if(number%i==0)                        
     { 
        sum += i;
     }
     
}
if(number==sum)
{
 System.out.println(number+"is a perfect number:");
}
else
{
System.out.println(number+"is not a perfect number:");
}
}
}