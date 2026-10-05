import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

        int result = 0;

            System.out.print("Enter your number: ");
            int number = williams.nextInt();

        for(int index = 1; index <= 12; index++){
            result = number * index;

        System.out.printf("%d X %d = %d%n", number, index, result);
        }    
    }
}




