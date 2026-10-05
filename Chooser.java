import java.util.Scanner;

public class Chooser{
    public static void main(String[] agrs){

  Scanner input = new Scanner(System.in);

    System.out.println("Enter your pet");       
    String pet = input.nextLine();

    if(pet.equals("Dog")){
        System.out.println("WOOF! Dogs are awesome!");
        }

    else{
        System.out.println("Cool choice, but I love dogs!");
        }
    }
}
