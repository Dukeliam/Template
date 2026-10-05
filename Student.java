import java.util.Scanner;

public class Student{
     public static void main(String[] args){


   Scanner input = new Scanner(System.in);

  System.out.println("Enter your name: ");
  String name = input.nextLine();

  System.out.println("Enter your age: ");
  int age = input.nextInt();
  input.nextLine();

  System.out.println("Enter your course: ");
  String course = input.nextLine();

  System.out.println("Enter your score: ");
  int score = input.nextInt(); 
   }
}
