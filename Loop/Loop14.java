public class Loop14
{
public static void main(String[] args)
{
 
for(int i=1;i<=100;i++)    //change number
{ 
  boolean isprime = true;
  for(int j=2;j<=i/2;j++)
  {
    
    if(i%j==0)
     {
       isprime= false;
       break;
     }
     
   }
  if(isprime && i>1)
   {
    System.out.println(i);
    }       
  }

 }
} 