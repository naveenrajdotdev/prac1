import java.lang.*;
import java.util.Scanner;
class ageClassification{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter a age");
       int age=obj.nextInt();
       if ((age>=1) && (age<=10))
       {
       System.out.println("Child");
       }
       else if((age>=10) && (age<=18))
       { 
       System.out.println("Teenage");
       }
       else if((age>=18) && (age<=45))
       {
       System.out.println("Adult");
       }
       else if((age>=45) && (age<=70))
       {
       System.out.println("Citizen");
       }
       else
       {
       System.out.println("No Birth");
       }
}
}