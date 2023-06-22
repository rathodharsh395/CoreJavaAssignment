import java.util.Scanner;

public class Loop17{

  public static void main(String args[]){

   Scanner hr=new Scanner(System.in);
   System.out.println("Enter the number for calculating first N prime numbers");
   int N= hr.nextInt();
   int count = 0;
   for(int i=2;i>0;i++)
    {
      boolean is_prime= true;
      
      for(int j=2;j<=i/2;j++)
       {
         if(i % j==0)
          { 
            is_prime=false;
            break;
          }   
       }

      if(is_prime)
       {
         System.out.println(i);
         count++;
       }
      if(count == N)
        {
         break;
        }

    }

  }
}