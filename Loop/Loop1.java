import java.util.Scanner;
public class Loop1
{
public static void main(String[] args){
Scanner hr= new Scanner(System.in);

System.out.println("Enter number of values for which you want average:");

float sum =0  ;

int n= hr.nextInt();

System.out.println("enter the numbers:");

for( int i=1;i<=n;i++)
{
int number = hr.nextInt();
sum += number;
}
float average = sum/n;

System.out.println("Average:"+ average);
}
}