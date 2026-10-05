import java.util.Scanner;

public class TrafficLight{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

        System.out.print("Enter Colour: ");
        String colour = williams.nextLine();

        switch(colour){
            case "Green": 
         System.out.println("GO");
                break;

            case "Yellow":
        System.out.println("GET READY");
                break;

            case "Red":
       System.out.println("STOP");
            break;

            default:
     System.out.println("INVALID");
        }

    }
}
