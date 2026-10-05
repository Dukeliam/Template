import java.util.Scanner;

public class Rectangle{
     public static void main(String[] agrs){

   double breath = 0;
   double length = 0;
   double area = 0;

   Scanner input = new Scanner(System.in); 

   System.out.print("Enter your breath:  ");
   breath = input.nextDouble();

   System.out.print("Enter your length");
   length = input.nextDouble();

    area = breath * length;
   System.out.println("The area is " + area + "cm^2");

   }
}
