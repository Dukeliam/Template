import java.util.Scanner;
public class Age{
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter age: ");
int age = input.nextInt();
System.out.print("Enter id: ");
boolean hasId = input.nextBool();


if(age >= 18 && hasId == true){
System.out.println("Entry allowed");
}

else if(age < 18 && hasId == false){
System.out.println("Entry not allowed");
   }
}
}
