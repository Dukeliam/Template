import java.util.Scanner;

public class Score{
     public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the score");
int scoreOne = input.nextInt();

System.out.println("Enter the score");
int scoreTwo = input.nextInt();

System.out.println("Enter the score");
int scoreThree = input.nextInt();

int total = scoreOne + scoreTwo + scoreThree;
int average = total / 3;

System.out.println(total);
System.out.println(average);
  }
}
