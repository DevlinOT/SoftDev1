import java.util.Scanner;
public class Wages{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double total = 0;

        int i = 1;
        while(i <= 3){
         System.out.print("How many hours did you work: ");
        x = input.nextDouble();
         System.out.println("What is your hourly rate: ");
        y = input.nextDouble();
        

        if( x > 40){
            total = (y * 40)+ ((x - 40) * (y * 1.5));
        }else {
            total = y*x;
        }
        total = Math.round(total * 100.0) / 100.0;
        System.out.println("Pay for employee "+ i + " : " + total + "\n");
        
        i++;
    }
    }
}