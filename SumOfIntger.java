public class SumOfInteger{
    public static void main(String...args ){
        int number = 234;
        int lastDigit = number % 10;

        number = number / 10;
        int secondDigit = number % 10;

        number = number / 10;


        int firstNumber  = number % 10;

        sum = lastDigit + secondDigit + firstDigit ;
        System.out.println("The sum of the integer is: " + sum);
        

    }

}
