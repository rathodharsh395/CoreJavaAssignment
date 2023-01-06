public class Loop13
{
public static void main(String[] args)
{

for(int i=100;i<=500;i++)                       //To switch the number
{
  int sum =0;
  int seperate = i;
  for(int j=1;j<=3;j++)                         //To seperate three digits & cube them & add them
    { 
     int lastDigit = seperate%10; 
      sum =sum + (lastDigit*lastDigit*lastDigit);
      seperate = seperate/10;
    }
   
    System.out.println(i == sum);
     


}
}
}