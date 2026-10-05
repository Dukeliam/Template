import java.util.Scanner;

public class Nokia{
    public static void main(String[] agrs){

              
        String mainMenu = """
              ==============MainMenu================
                            1. PhoneBook
                            2. Game
                            3. Settings
                            4. Exit
                         """;
            System.out.println(mainMenu);

    Scanner input = new Scanner(System.in);

      System.out.print("Enter number: ");
      int number = input.nextInt();

        switch(number){
            case 1 -> {System.out.println("PhoneBook");
                        String PhoneBook = """ 
                                              1. Name
                                              2. Address
                                           """;
                            System.out.print(PhoneBook);

                  System.out.print("Enter number: ");
                  int numberOne = input.nextInt();
                  
                switch(numberOne){
                    case 1 -> System.out.println("Name");

                    case 2 -> System.out.println("Address");
                }
                }

            case 2 ->  {System.out.println("Game");
                                String game = """ 
                                              1. Snake
                                              2. Bounce Ball
                                           """;
                               System.out.print(game);
 

                  System.out.print("Enter number: ");
                  int numberTwo = input.nextInt();
                  
                switch(numberTwo){
                    case 1 -> System.out.println("Snake");

                    case 2 -> System.out.println("Bounce Ball");
                }
                }

  
        }
    }
}
