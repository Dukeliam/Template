import java.util.Scanner;

public class Multiples{
    public static void main(String[] agrs){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your number");
    int number1 = input.nextInt();

    System.out.println("Enter your number");
    int number2 = input.nextInt();

    int triple = number1 * 3;
    int doubled = number2 * 2;
    int result = triple % doubled;

    System.out.println(triple);
    System.out.println(doubled);
    System.out.println(result);
    }
}
