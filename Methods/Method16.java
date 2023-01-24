public class Method16
{
 void printn(byte num){
 System.out.println("Byte Data:"+num);
 }
 void printn(short num){
 System.out.println("Short Data:"+num);
 }
 void printn(int num){
 System.out.println("Int Data:"+num);
  }
 void printn(long num){
 System.out.println("Long Data:"+num);
 }
 void printn(float num){
 System.out.println("Float Data:"+num);
 }
 void printn(double num){
 System.out.println("Double Data:"+num);
 }
 public static void main(String [] args)
 {
  Method16 re = new Method16();
  re.printn(127);
  re.printn(32767);
  re.printn(327688888);
  re.printn(327688888888l);
  re.printn(33.1428f);
  re.printn(99.5999);
 }
}
    