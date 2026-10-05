import java.util.Scanner;

public class Description{
    public static void main(String[] agrs){

  Scanner input =   new Scanner(System.in);

    System.out.print("Enter your grade: ");
    String grade = input.nextLine();

        switch(grade){
            case "A":
        System.out.printf("%s: Excellent%N", grade);
            break;

            case "B":
        System.out.printf("%s: Very Good%n", grade);
            break;

            case "C":
        System.out.printf("%s: Good%n", grade);
            break;

            case "D":
        System.out.printf("%D: Pass%n", grade);
            break;

            case "F":
        System.out.printf("%s: Fail%n", grade);
        }
    }
}
