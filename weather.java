import java.lang.*;
import java.util.Scanner;
class Weather{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the rainfall level");
       int rainfall=obj.nextInt();
       if ((rainfall>=200) && (rainfall<300))
       {
       System.out.println("Flood level");
       }
       else if((rainfall>=150)  && (rainfall<200))
       {
       System.out.println("Very Heavy Rain");
       }
       else if((rainfall>=100) && (rainfall<150))
       {
       System.out.println("Heavy rain");
       }
       else if((rainfall>=50) && (rainfall<100))
       {
       System.out.println("Moderate Rain");
       }
       else
       {
       System.out.println("Light Rain");
       }
}
}