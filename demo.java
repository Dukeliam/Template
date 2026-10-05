import java.util.Scanner;

public class Demo{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

            int sum = 0;
        
            for(int index = 1; index <= 10; index++){
        System.out.print("Enter your number: ");
            int score = input.nextInt();

            sum = score + score + score + score + score + score + score + score + score + score;
}
        System.out.println(sum);
}
}
