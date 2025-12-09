import java.lang.*;
import java.util.Scanner;
class waterLevel{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the water level");
       int waterlevel=obj.nextInt();
       if ((waterlevel>=90) && (waterlevel<100))
       {
       System.out.println("Danger Zone");
       }
       else if((waterlevel>=70)  && (waterlevel<90))
       {
       System.out.println("Warning zone");
       }
       else if((waterlevel>=50) && (waterlevel<70))
       {
       System.out.println("Safe Zone");
       }
       else if((waterlevel>=30) && (waterlevel<50))
       {
       System.out.println("Normal Zone");
       }
       else
       {
       System.out.println("Low Level");
       }
}
}