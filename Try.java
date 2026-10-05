import java.util.Scanner;

public class BarChart{
    public static void main(String[] agrs){
    
       Scanner input = new Scanner(System.in);

    System.out.print("Enter number between 1 and 30: ");
    int value = input.nextInt();

        
    for(int count = 1; count <= value; count++){
      System.out.print("*");
}
    System.out.println();
}
}
