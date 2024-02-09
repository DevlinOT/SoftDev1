public class Sum{
    public static void main(String[] args) {
        int total = 0;
        int even = 0;
        int odd = 0;

        int x = 1;
        while(x <= 100){
             total += x;
             if(x%2 == 0){
                even += x;
             }else{
                odd += x;
             }
             x++;
           
        }
        System.out.println("The sum of all numbers between 1 and 100 is: "+ total);
        System.out.println("The sum of all even numbers between 1 and 100 is: "+ even);
        System.out.println("The sum of all odd numbers between 1 and 100 is: "+ odd);
        if((odd - even) >=0){
        System.out.println("Diffrence between even and odd numbers is : "+ (odd - even));
        }else{
        System.out.println("Diffrence between even and odd numbers is : "+ (even-odd));
        }
    }
 }