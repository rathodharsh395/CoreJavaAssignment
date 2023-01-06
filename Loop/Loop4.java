public class Loop4
{
public static void main(String[] args)      /*     1010101
                                                    10101
                                                     101
                                                      1     */
{
 int colm = 7;

 for(int i=1;i<=7;i+=2)               //4 rows 
  {
   for(int j=colm;j>=i;j--)           //7 colm
     {
      if(j%2==0)
        {
          System.out.print(0);
        }
       else
        {
          System.out.print(1);
        }
      }
   System.out.println();              //switch line

   for(int k=1;k<=i;k+=2)
      {
        System.out.print(" ");
       }

  }

}
}
