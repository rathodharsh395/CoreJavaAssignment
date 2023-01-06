import java.util.Scanner;

public class Loop22
{
public static void main(String[] args)
{
Scanner hr = new Scanner(System.in);
System.out.println("Enter for how many even Nos you want sum:");

int n = hr.nextInt();
int sum = 0;
for(int i=2;i<=2*n;i++)
 { 
    if(i%2==0)
     {
     sum += i;
     }
    
  }
 System.out.println(sum);

}

}