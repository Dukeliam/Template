import java.util.Scanner;
 public class Vision{
public static void main(String[] args){


    Scanner input = new Scanner(System.in);
   System.out.print("Input a number: ");
     int number = input.nextInt();
    str result = " ";
    
  while(number > 0){
    int remainder % 10;
  int newNumber = number / 10;
    
    result = result + remainder;
    number = newNumber / 10;    
    }   
  for(int index = result.length(); index >=1; index--)  {
    }
        System.out.print((index) + " ");    

    }



}
