import java.util.Scanner;

public class Keliven{
   public static void main(String[] agrs){

  Scanner input = new Scanner(System.in);

System.out.println("Enter your name: ");
String name = input.nextLine();

System.out.println("Enter your age: ");
int age1 = input.nextInt();

input.nextLine();

System.out.println("Enter your name: ");
String name2 = input.nextLine();

System.out.println("Enter your age: ");
int age2 = input.nextInt();

int sum = age1 + age2;

System.out.println(sum);


    }
}
