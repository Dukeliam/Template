public class SumOfEvenNumber{
    public static void main(String[] agrs){
        int sum = 0;

     for(int index = 2; index <= 100; index++){
        if(index % 2 == 0){
            sum = sum + index;        
            }
        }   
             System.out.println(sum);
    }
}
