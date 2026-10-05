import java.util.Scanner;

public class Game{
     public static void main(String[] agrs){

Scanner input = new Scanner(System.in);

System.out.println("Enter name");
String name = input.nextLine();

System.out.println("Enter level");
int level = input.nextInt();

System.out.println("Enter coins");
int coin = input.nextInt();

System.out.println("Enter lives");
int lives = input.nextInt();

System.out.println("======CHARACTER======");
System.out.println("name: " + name);
System.out.println("level: " + level);
System.out.println("coins: " + coin);
System.out.println("lives :" + lives);

  }
}
