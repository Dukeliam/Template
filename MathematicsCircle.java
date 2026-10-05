import java.util.Scanner;

public class MathematicsCircle{
    public static void main(String[] agrs){

        int radius;
        int diameter;
        double circumference;
        double area;

        Scanner input = new Scanner(System.in);

    System.out.print("Enter your radius: ");
    radius = input.nextInt();

    diameter = 2 * radius;
    circumference = 2 * Math.PI * radius;
    area = Math.PI * (Math.pow(radius, 2));

        System.out.printf("%dcm%n", diameter);
        System.out.printf("%fcm^2%n", circumference);
        System.out.printf("%fcm%n", area);
    
    }
}
