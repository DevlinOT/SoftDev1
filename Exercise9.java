public class Exercise9{
    public static void main(String[] args) {
        
        for(int x = 1; x <= 5; x++){
            System.out.print(x+ ": ");
            for(int y = 8; y >= 2; y-=2){
            if(y > 2){
            System.out.print(+y+", ");
            }else{
                System.out.print(y);
            }

        
            }
            System.out.println();
        }
    }
 }