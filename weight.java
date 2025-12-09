import java.lang.*;
import java.util.Scanner;
class Weight{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the weight ");
       int weight=obj.nextInt();
       if ((weight>=90) && (weight<120))
       {
       System.out.println("Very Heavy");
       }
       else if((weight>=70)  && (weight<90))
       {
       System.out.println("Heavy");
       }
       else if((weight>=50) && (weight<70))
       {
       System.out.println("Normal weight");
       }
       else if((weight>=30) && (weight<50))
       {
       System.out.println("Light Weight");
       }
       else
       {
       System.out.println("Ver Light");
       }
}
}