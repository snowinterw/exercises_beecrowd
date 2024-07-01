import java.util.Scanner;

public class Bee1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int contador = 0;

        for(int i = 0; contador < 6; i++ ){
            if(i >= x){
                if(i % 2 != 0 ){
                    System.out.println(i);
                    contador ++;
                }
            } 
        }
        input.close();
    }
}