import java.util.Scanner;
public class Loop15
{
public static void main(String[] args)
{
System.out.println("Enter the Number for which you want prime factor:");
Scanner hr= new Scanner(System.in);
int number = hr.nextInt();

for(int i=2;i<=number/2;i++)     //change number
 { 
   int remainder = number%i;       //check factor or not 
   boolean isPrime = true; 
   
   for(int j=2;j<=i/2;j++)        //check prime or not 
    {
      if(i%j ==0)
       {
         isPrime = false;
         break;
        }
       
     }   
     if(remainder ==0 && isPrime == true)
       {
          System.out.println(i);
              
       }
     
         
       
    
  }

}
}  