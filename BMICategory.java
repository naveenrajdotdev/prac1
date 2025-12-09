import java.lang.*;
import java.util.Scanner;
class BMICategory{
public static void main(String args[]){
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter BMI value");
       int BMI=obj.nextInt();
       if ((BMI>=35) && (BMI<40))
       {
       System.out.println("Severly Obese");
       }
       else if ((BMI>=30) && (BMI<35))
       {
       System.out.println("Obese");
       }
       else if ((BMI>=25) && (BMI<30))
       {
       System.out.println("Overweight");
       }
       else if ((BMI>=18) && (BMI<25))
       {
       System.out.println("Normal");
       }
       else
       {
       System.out.println("Underweight");
       }
}
}