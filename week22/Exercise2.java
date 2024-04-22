import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Enter the first number");
        num1 = input.nextInt();
        System.out.println("Enter the second number");
        num2 = input.nextInt();
        result = (num1 + num2) * 4;
        
        System.out.println("("+num1+" + "+num2+" ) * 4 = "+result);

        // inputs required

        // if / else, and/or loops

        // outputs

        // input.close();
    }
}