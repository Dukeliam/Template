import java.util.Scanner;

public class Week{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = input.nextInt();

    switch(number){
        case 1:
    System.out.print("Monday: ");
        break;

        case 2:
    System.out.print("Tuesday");
        break;

        case 3:
    System.out.print("Wednesday");
        break;

        case 4:
    System.out.print("Thurday");
        break;

        case 5:
    System.out.print("Friday");
        break;

        case 6:
    System.out.print("Saturday");
        break;

        case 7:
    System.out.print("Sunday");
        }

    }
}
