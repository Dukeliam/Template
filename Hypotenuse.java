import java.util.Scanner;

public class Hypotenuse{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            double lengthOfFirstNumber;
            double lengthOfSecondNumber;
            double result;

        System.out.print("Enter the Length of side A: ");
        lengthOfFirstNumber = input.nextDouble();

        System.out.print("Enter the Length of side B: ");
        lengthOfSecondNumber = input.nextDouble();

        result = Math.sqrt(Math.pow(lengthOfFirstNumber, 2) +  Math.pow(lengthOfSecondNumber, 2));

        System.out.println(result);
}
}
