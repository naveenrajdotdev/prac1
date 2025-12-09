import java.lang.*;
import java.util.Scanner;
class Grade{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter your mark");
       int mark=obj.nextInt();
       if ((mark>90) && (mark<=100))
       {
       System.out.println("Grade A");
       }
       else if((mark>80)&&(mark<=90))
       {
       System.out.println("Grade B");
       }
       else if((mark>70)&&(mark<=80))
       {
       System.out.println("Grade C");
       }
       else if((mark<=70)&&(mark>=0))
       {
       System.out.println("Grade D");
       }
       else
{
       System.out.println("No Grade");
       }
}
}