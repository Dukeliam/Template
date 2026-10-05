import java.util.Scanner;

public class Greetings{
    public static void main(String[] agrs){
    
Scanner input = new Scanner(System.in);

    String name;

    System.out.println("Enter your name");
    name = input.nextLine();

    if(name.equals("Williams")){
        System.out.println("Hello Friend");
        }    

    else{
        System.out.println("Hello Stranger");
        }
    
    }
}
