public class Loop26
{
 public static void main(String[] args)
 {
  

  for(int i=2;i<=1000;i++)     //switch the number
   {
    int sumOfFactors = 0;
    
    for(int j=1;j<=i/2;j++)    //check factor
     { 
      
      if(i%j==0)
       {
        sumOfFactors += j;
       }

     }
       if(sumOfFactors==i)
        { 
         System.out.println(i);
        }
    }

 
 }
}


   
       
    