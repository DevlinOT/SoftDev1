import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int sum = 0;
    
        System.out.print("Enter number 1: ");
        number = input.nextInt();
         System.out.print("Enter number 2: ");
        number2 = input.nextInt();
         System.out.print("Enter number 3: ");
        number3 = input.nextInt();
        System.out.print("Enter number 4: ");
        number4 = input.nextInt();

        sum = ((number+number2+number3+number4)*4);

        System.out.println(number+" + "+number2+" + "+number3+" + "+number4+ " ) * 4 = " +sum);

    }
}