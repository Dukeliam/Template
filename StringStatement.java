import java.util.Scanner;

public class StringStatement{
    public static void main(String[] agrs){

      Scanner input = new Scanner(System.in);

    String name;
    boolean isStudent;

    System.out.print("Enter your name: ");
    name = input.nextLine();

    System.out.println("Are you a student (true/false): ");
    isStudent = input.nextBoolean();

    if(name.isEmpty()){
        System.out.println("You didn't enter your name");
        }

    else{
        System.out.println("Hello " + name);
        }

    if(isStudent){
        System.out.println("You are a student");
        }
    else{
        System.out.println("You are not a student");
        }    
            
    }
}
