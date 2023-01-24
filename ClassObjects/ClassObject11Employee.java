public class ClassObject11Employee
{
 int Salary;
 int Hours;
void setEmployeeInformation(int salary,int hours)
{
 Salary = salary;
 Hours = hours;
 }
public static void main(String []args)
{ 
 ClassObject11Employee re = new ClassObject11Employee();
  re.setEmployeeInformation(450,10);
  re.addSalary();
  re.addWork();
 System.out.println("Final Salary:"+ re.Salary);
 }
 
 void addSalary(){
      if(Salary<500)
        Salary= Salary+10;
      }
 void addWork(){
      if(Hours>6)
       Salary= Salary+5;
      }
}




