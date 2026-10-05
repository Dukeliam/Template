public class SumOfInteger2{
    public static void main(String...args ){
        int number = 234;
        int firstDigit = number % 10;

        number = number / 10;
        int secondDigit = number % 10;

        number = number / 10;


        int lastDigit  = number % 10;

        int sum = firstDigit + secondDigit + lastDigit;
        System.out.println("The sum of the integer is: " + sum);
        

    }

}
