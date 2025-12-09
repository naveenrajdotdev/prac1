import java.lang.*;
import java.util.Scanner;
class Score{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the score");
       int score=obj.nextInt();
       if ((score>=90) && (score<100))
       {
       System.out.println("Excellent");
       }
       else if((score>=70)  && (score<90))
       {
       System.out.println("Very Good");
       }
       else if((score>=50) && (score<70))
       {
       System.out.println("Good");
       }
       else if((score>=30) && (score<50))
       {
       System.out.println("Poor");
       }
       else
       {
       System.out.println("Very Poor");
       }
}
}