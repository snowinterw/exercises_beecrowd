import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int codigo = input.nextInt();
            int quantidade = input.nextInt();
            double produtorr;

            if(codigo == 1){
                produtorr = 4.00;
            }else if(codigo == 2){
                produtorr = 4.50;
            }else if(codigo == 3){
                produtorr = 5.00;        
            }else if(codigo == 4){
                produtorr = 2.00;
            }else{
                produtorr = 1.50;
            }
            
            double total = produtorr * quantidade;
            System.out.printf("Total: R$ %.2f\n", total );
        input.close();
    }
}