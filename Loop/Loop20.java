import java.util.Scanner;
public class Loop20
{
public static void main(String[] args)
{
 Scanner hr = new Scanner(System.in);
 System.out.println("Enter a +ve integer to print table:");
 int number = hr.nextInt();
 int table = 0;
 for(int i=1;i<=10;i++)
   {
    if(number>0)
      {
       table = number*i;
       System.out.println(table);
      } 
      else
       {
        System.out.println("Invalid Input");
        break;
       }
    }
}
}