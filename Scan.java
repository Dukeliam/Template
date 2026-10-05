import java.util.Scanner;

public class Scan{
     public static void main(String[] agrs){
 
Scanner input = new Scanner(System.in);

System.out.println("Enter your name");
String name = input.nextLine();

System.out.println("Enter your age");
int age = input.nextInt();

input.nextLine();
System.out.println("Enter your course");
String course = input.nextLine();

System.out.println("Enter your school");
String school = input.nextLine();

System.out.println("Enter your programming language");
String code = input.next();

   }
}
