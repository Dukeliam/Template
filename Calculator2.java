import java.util.Scanner;

public class Calculate{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

       System.out.print("Enter operator: ");
       String operation = input.nextLine();

       System.out.print("Enter First Number: ");
       int firstNumber = input.nextInt();

       System.out.print("Enter Second Number: ");
       int secondNumber = input.nextInt();

            switch(operation){
                case "+":
            System.out.printf("%d + %d = %d%n", firstNumber, secondNumber, firstNumber + secondNumber);
                break;

                case "-":
            System.out.printf("%d - %d = %d%n", firstNumber, secondNumber, firstNumber - secondNumber);
                break;

                case "*": 
            System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, firstNumber * secondNumber);
                break;

                case "/":
            System.out.printf("%d / %d = %d%n", firstNumber, secondNumber, firstNumber / secondNumber);
                break;
        }
    }
}
