public class Operator14B
{
public static void main(String[] args)
{
int  number =6789;

int first = number%10000;
first /=1000;
first +=2;

int second = number%1000;
second /= 100;
second += 2;

int third = number%100;
third /= 10;
third += 2;

int fourth = number%10;
fourth /= 1;
fourth += 2;

number = (first%10)*1000+(second%10)*100+(third%10)*10+(fourth%10);
System.out.println(number);

}
}
