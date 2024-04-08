import java.util.Scanner;
public class EightArray{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] x = {23, 104, 3, 65, 1002, 90000, 77, 88, 99, 10};
        int[] y = new int[x.length - 1];
        
        System.out.print("Enter number to remove: ");
        int number = input.nextInt();
        boolean found = false;
        for(int i = 0; i < x.length; i++){
            if(number == x[i]){
                found = true;
            }
        }

        int j = 0;
        for(int i = x.length - 1; i >= 0; i--){
            y[j++] = x[i];
        }
        System.out.println("Index\tBefore\tAfter");
        System.out.println("-----\t-----\t-----");

        for(int i = 0; i < y.length; i++){
             System.out.println(i + "\t" + x[i] + "\t" + y[i]);
            }
            System.out.println();
    }
}