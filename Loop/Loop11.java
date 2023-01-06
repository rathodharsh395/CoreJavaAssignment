import java.util.Scanner;
public class Loop11{
 public static void main(String[] args){

  Scanner hr = new Scanner(System.in);
  System.out.println("enter the numerator and denominator:");
  int c;
  int number1 = hr.nextInt();
  int number2 = hr.nextInt();
  if(number1>number2){
      c=number2;
  }
  else
     {
      c=number1;
     }
  for(;c>=1;c--){
     if((number1%c==0) && (number2%c==0)) {
         number1 = number1/c;
         number2 = number2/c;
         System.out.println(c);
         break;
     }
  }
  
  System.out.println(number1+"/"+number2);
 
 }
}