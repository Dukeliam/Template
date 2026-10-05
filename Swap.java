import java.util.Scanner;

public class Swap{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int numberOne = input.nextInt();

         System.out.print("Enter Second Number: ");
        int numberTwo = input.nextInt();

            System.out.println("Before: " + numberOne + " and " + numberTwo);

            numberOne = numberOne + numberTwo;
            numberTwo = numberOne - numberTwo;
            numberOne = numberOne - numberTwo;

           System.out.println("After: " + numberOne + " and " + numberTwo);    
    }
}
