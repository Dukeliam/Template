public class Profile{
    public static void main(String[] agrs){

        String name = "Williams";

        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("3");
        int lastIndex = name.lastIndexOf("3");

        name = name.toUpperCase();
        name = name.toLowerCase();

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        
    }
}
