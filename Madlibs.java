import java.util.Scanner;

public class Madlibs{
    public static void main(String[] agrs){

   Scanner input = new Scanner(System.in);

   String adjective1;
   String noun1;
   String adjective2;
   String verb1;
   String adjective3;

System.out.print("Enter an adjective (description): ");
adjective1 = input.nextLine();

System.out.print("Enter a noun (animal or person): ");
noun1 = input.nextLine();

System.out.print("Enter a adjective (description): ");
adjective2 = input.nextLine();

System.out.print("Enter a verb end with -ing (action): ");
verb1 = input.nextLine();

System.out.print("Enter a adjective (description): ");
adjective3 = input.nextLine();

 System.out.println("Today i went to a " + adjective1 + " zoo.");
 System.out.println("In an exhibit, i saw a " + noun1 + ".");
 System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
 System.out.println("i was " + adjective3 + "!");
   


    }
}
