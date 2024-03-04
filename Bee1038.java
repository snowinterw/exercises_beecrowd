import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int codigo = input.nextInt();
            int quantidade = input.nextInt();
            double produto;

            if(codigo == 1){
                produto = 4.00;
            }else if(codigo == 2){
                produto = 4.50;
            }else if(codigo == 3){
                produto = 5.00;        
            }else if(codigo == 4){
                produto = 2.00;
            }else{
                produto = 1.50;
            }
            
            double total = produto * quantidade;
            System.out.printf("Total: R$ %.2f\n", total );
        input.close();
    }
}