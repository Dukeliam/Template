import java.util.Scanner;

public class StringReverse{
    public static void main(String[] agrs){
    
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = input.nextLine();
            
            String oringinal = word;
            String reverse = "";
            char [] vowel = {'A', 'a', 'E','e','I','i','O','o','U','u'};
            int count = 0;
            
            for(int index = word.length() - 1; index >= 0; index--){                             
                   for(int counter = 0; counter < vowel.length; counter++){
                        if(word.charAt(index) == vowel[counter]){
                              count += 1;
                  } 
             }
                        reverse = reverse + word.charAt(index);
       }
                  System.out.println(reverse);
                  System.out.println(count);
    }
}
