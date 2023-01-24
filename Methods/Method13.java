
public class Method13
{
 int perfect(int index){
  int sum = 0;
  for(int i=1;i<=index/2;i++){
     if(index%i==0){
        sum += i;
       }
     }
   return sum;
  }
 public static void main(String [] args)
 {
  Method13 re = new Method13();
  for(int index=1;index<=10000;index++){
     if(index==re.perfect(index)){
       System.out.println(index);
       }
     }
  }
}