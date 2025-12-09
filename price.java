import java.lang.*;
import java.util.Scanner;
class Price{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the price");
       int price=obj.nextInt();
       if ((price>=10000) && (price<20000))
       {
       System.out.println("Premium Product");
       }
       else if((price>=5000)  && (price<10000))
       {
       System.out.println("High Range");
       }
       else if((price>=3000) && (price<5000))
       {
       System.out.println("Mid Range");
       }
       else if((price>=1000) && (price<3000))
       {
       System.out.println("Budget Range");
       }
       else
       {
       System.out.println("Cheap Product");
       }
}
}