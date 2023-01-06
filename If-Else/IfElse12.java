import java.util.Scanner;

public class IfElse12
{
public static void main(String[] args)
{
System.out.println("Enter Age, Gender(M or F), marital status(Y or N):");
Scanner hr = new Scanner(System.in);

int age = hr.nextInt();
char gender = hr.next().charAt(0);
char status = hr.next().charAt(0);
if(age <20 || age >60)
{
System.out.println("ERROR");
}

if(gender == 'F')
{
 System.out.println("employee can work only in urban areas:");
}


if(gender == 'M' && age<40)
{
System.out.println("employee can work anywhere:");
 }
if(gender == 'M' && age>40)
{
System.out.println("employee can work in urban areas only");
}

}
}
