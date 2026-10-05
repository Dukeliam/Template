
public class Meters{
    public static void main(String[] args){
        
        double subTotal = 10;
        double gratuityRate = 12;
        double gratuity = subTotal * gratuityRate / 100;

        double total = gratuity + subTotal;
        char dola = '$';
        
        System.out.println("The gratuity is " + dola + gratuity + " and total is " + dola + total );

     }
} 
