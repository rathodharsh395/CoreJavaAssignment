public class ClassObject9Employee
{
  void empDetails(String name,int year,String address)
    {
        System.out.println(name+"    "+year+"         "+address);
     }
public static void main(String[] argsl)
{ 
 System.out.println("Name "+" "+"Year of Joining"+"   "+"Address");
 ClassObject9Employee re = new ClassObject9Employee();

 re.empDetails("Rober",1994,"64C-WallsStreat");
 re.empDetails("Sam  ",2000,"68D-WallsStreat");
 re.empDetails("John ",1999,"26B-WallsStreat");
 }
}
 
