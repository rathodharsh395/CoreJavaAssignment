public class ClassObject2Student
{
String name;
int roll_no;
long phone_no;
String address;

 public static void main(String [] args)
{ 

 ClassObject2Student re = new ClassObject2Student();
 re.name= "john";
 re.roll_no = 2 ;
 re.phone_no = 111111111l;
 re.address = "pune Maharastra";

 ClassObject2Student ref = new ClassObject2Student();
 ref.name= "sam";
 ref.roll_no= 1 ;
 ref.phone_no = 2222222222l;
 ref.address = "mumbai Maharastra";

System.out.println(" Name:"+ref.name+
                    " roll no:"+ref.roll_no+
                    " Phone NO:"+ref.phone_no+
                    " Address:"+ ref.address);

 System.out.println(" Name:"+re.name+
                    " roll no:"+ re.roll_no +
                    " Phone NO:"+re.phone_no+
                    " Address:"+re.address);

}
}

