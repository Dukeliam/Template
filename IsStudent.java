public class IsStudent{
    public static void main(String[] agrs){

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 1000;

        if(isStudent){
           if(isSenior){
                System.out.println("You get a senior discount of 20% ");
                System.out.println("You get a student discount of 10%");
                price *= 0.7;
            }
            else{
                 System.out.println("You get a student discount of 10%");
            price *= 0.9;
            }
           
        }
        else{
            price *= 1;
        }
        System.out.println("The price of a ticket is: $" + price);
    } 
}
