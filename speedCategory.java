import java.lang.*;
import java.util.Scanner;
class speedCategory{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the speed");
       int speed=obj.nextInt();
       if ((speed>=100) && (speed<120))
       {
       System.out.println("Very Fast");
       }
       else if ((speed>=80) && (speed<100))
       {
       System.out.println("Fast");
       }
       else if ((speed>=60) && (speed<80))
       {
       System.out.println("Normal");
       }
       else if ((speed>=40) && (speed<60))
       {
       System.out.println("Slow");
       }
       else
       {
       System.out.println("VerySlow");
       }
}
}