import java.util.Scanner;

public class Condition{
    public static void main(String[] agrs){

      Scanner input = new Scanner(System.in);

    int age;

    System.out.print("Enter your age: ");
    age = input.nextInt();

    if(age >= 65){
        System.out.println("You are old");
        }
    else if(age >= 18){
        System.out.println("You are an adult");
        }

    else if(age < 0){
        System.out.println("You are not born");
        }

    else if(age == 0){
        System.out.println("You are a baby");
        }

    else{
        System.out.println("You are not adult");
        }
    }
}
