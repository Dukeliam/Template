import java.util.Scanner;

public class Calculator{
     public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the number");
int numberOne = input.nextInt();

System.out.println("Enter the number");
int numberTwo = input.nextInt();

int sum = numberOne + numberTwo;
int substract = numberOne - numberTwo;
int product = numberOne * numberTwo;
int divide = numberOne / numberTwo;

System.out.println(sum);
System.out.println(substract);
System.out.println(product);
System.out.println(divide);
  }
}
