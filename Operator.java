import java.util.Scanner;

public class Operator{
     public static void main(String[] agrs){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter your name: ");
  String name = input.nextLine();

  System.out.print("Enter your age: ");
  int age = input.nextInt();

   System.out.println("Hello" + name);
   System.out.println("you are " + age + "years old");
   }
}
