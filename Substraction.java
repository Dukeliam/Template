import java.util.Scanner;

public class Substraction{
       public static void main(String[] agrs){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number");
int numberOne = input.nextInt();

System.out.print("Enter a number");
int numberTwo = input.nextInt();

int product = numberOne * numberTwo;
int result = product / 2;

System.out.print(result);
  }
}
