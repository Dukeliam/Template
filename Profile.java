import java.util.Scanner;

public class Profile{
     public static void main(String[] agrs){

  Scanner input = new Scanner(System.in);

  System.out.println("Enter name: ");
  String name = input.nextLine();

  System.out.println("Enter age: ");
  int age = input.nextInt();

   System.out.println("Enter gpa :");
   double gpa = input.nextDouble();

   System.out.println("Are you you a Student? (true/false)");
   boolean isStudent = input.nextBoolean();

    

  System.out.println("Hello"  + name);
  System.out.println("You are"  + age + "years old");
  System.out.println("You got " + gpa);
  System.out.println("Student: " + isStudent);

 if(isStudent){
   System.out.println("You are enrolled as a student");
}
 else{
     System.out.println("You are not enrolled");
}
  }
}
