import java.lang.*;
import java.util.Scanner;
class temperatureLevel{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter temperature");
       int temp=obj.nextInt();
       if ((temp>=60) && (temp<70))
       {
       System.out.println("Extreme Heat");
       }
       else if ((temp>=50) && (temp<60))
       {
       System.out.println("Very Hot");
       }
       else if ((temp>=40) && (temp<50))
       {
       System.out.println("Hot");
       }
       else if ((temp>=30) && (temp<40))
       {
       System.out.println("Warm");
       }
       else
       {
       System.out.println("cold");
       }
}
}