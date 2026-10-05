import java.util.Scanner;

public class Laptop{
    public static void main(String[] agrs){

        System.out.println("1. Start");
        System.out.println("2. Setting");
        System.out.println("3. Exit");

      Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

            switch(number){
                case 1:
       System.out.println("Start Message");
                break;

                case 2:
        System.out.println("Settings Message");
                break;

                case 3:
        System.out.println("Exist Message");
                break;    
        }
    }
}
