import java.util.Scanner;

public class Bee1071 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int numero = 0;
        int maior, menor;

        if(x > y){
            maior = x;
            menor = y;
        }else{
            maior = y;
            menor = x;
        }

        for(int i = menor +1; i < maior; i++){
            if(i % 2 != 0){
               numero += i; 
            }              
        }
        System.out.println(numero);

        input.close();
    }
}