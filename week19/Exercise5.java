import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        
    
        System.out.print("Enter a number: ");
        number = input.nextInt();
         
         if(number >= 5 && number <= 10){
           System.out.println("number updated to: "+(number+10));
         }else if(number >= 15 && number <= 20){
          System.out.println("number updated to: "+(number+20));
         }else if(number >= 25 && number <= 30){
          System.out.println("number updated to: "+(number+30));
         }else if(number >= 35 && number <= 40){
          System.out.println("number updated to: "+(number+40));
         }else if(number >= 45 && number <= 50){
          System.out.println("number updated to: "+(number+50));
         }else{
          System.out.println("number updated to: "+(number+5));
         }

        

    }
}