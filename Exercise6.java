import java.util.Scanner;
public class Exercise6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        
    
        System.out.print("Enter a number: ");
        number = input.nextInt();
         
         if(number >= 4 && number <=8 ){
           System.out.println("number updated to: "+(number*6));
         }else if(number >= 10 && number <= 14){
          System.out.println("number updated to: "+(number*12));
         }else if(number >= 16 && number <= 20){
          System.out.println("number updated to: "+(number*18));
         }else if(number >= 22 && number <= 26){
          System.out.println("number updated to: "+(number*24));
         }else{
          System.out.println("number updated to: "+(number*3));
         }

        

    }
}