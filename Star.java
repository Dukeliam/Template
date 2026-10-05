public class Star{
    public static void main(String[] agrs){
               
         char star = '*';

         for(int index = 1; index < 6; index++){
                
                for(int count = 1; count < 6; count ++){

                    System.out.print(star);

                }
                  System.out.println();

                for(int hash = 1; hash < 6; hash ++){

                    System.out.print("#");
                }
                
                       System.out.println();

                for(int dollar = 1 ; dollar < 6; dollar++){

                        System.out.print("$");
                }

                System.out.println();
          }



    }




}
