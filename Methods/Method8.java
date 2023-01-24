import java.util.Scanner;
public class Method8
{
 static String getGrades(int marks){
   String grade="check INPUT";

   if(marks>=91&&marks<=100){
      grade = "AA";
     }
   if(marks>=81&&marks<=90){
      grade = "AB";
     }
   if(marks>=71&&marks<=80){
      grade = "BB";
     }
   if(marks>=61&&marks<=70){
      grade = "BC";
     }
   if(marks>=51&&marks<=60){
      grade = "CD";
     }
   if(marks>=41&&marks<=50){
      grade = "DD";
     }
   if(marks<=40){
      grade = "Fail";
     }
   return grade;
  }
 public static void main(String [] args)
 {
  System.out.println("Enter Marks");
  Scanner hr= new Scanner(System.in);
  int marks= hr.nextInt();
  System.out.println("Grade: "+getGrades(marks));
 }
}
    