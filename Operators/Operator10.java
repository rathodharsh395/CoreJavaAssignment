public class Operator10
{
public static void main(String [] args)
{
int a =6 ;
int b =8 ;
int  c;

// using third variable
 c = a;
 a = b;
 b = c;
System.out.println(" a="+ a);
System.out.println("b="+ b);
 
// without using third variable

int d = 5; 
int e = 7;
 
 /* first take the difference of two numbers then subtract the difference 
  from bigger number and add the difference to the result of bigger number */

e -= d;//2
d += e ;//7
e = d-e ;




System.out.println("d:"+ d);
System.out.println("e:"+ e );



}
}