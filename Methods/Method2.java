import java.util.Scanner;
public class Method2
{
String Number;
public static void main(String [] args)
{
 Scanner hr = new Scanner(System.in);
 System.out.println("Enter No to check Even Odd");
 int number = hr.nextInt();
 Method2 re= new Method2();
 System.out.println("Number is:"+re.evenOdd(number));
 
}
 String evenOdd(int number){
 
 if(number%2==0){
    Number = "Even NO";
    return Number ;
    }
 else{
     Number = "Odd NO";
     return Number;
     }
  }

}
        