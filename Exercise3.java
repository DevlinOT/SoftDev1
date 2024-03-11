import java.util.Scanner;
public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        
    
        System.out.print("Enter any number apart from 10: ");
        number = input.nextInt();
         
         if(number != 10){
           System.out.println("number entered is not equal to 10");
         }else{
            
            System.out.println("You cannot enter the number 10");
         }

        

    }
}