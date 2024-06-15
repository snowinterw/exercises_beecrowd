import java.util.Scanner;

public class Bee1074_2 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String positivo_negativo;
        String inpar_par;
        
        for(int i = 0; i < n; i++){
            int valor = input.nextInt();
            
            if (valor == 0) {
                System.out.println("NULL");
                continue; 
            }

            if(valor > 0){
                positivo_negativo = "POSITIVE";
            } else {
                positivo_negativo = "NEGATIVE";
            }
            
            if(valor % 2 == 0){
                inpar_par = "EVEN";
            } else {
                inpar_par = "ODD";
            }
            
            System.out.println(inpar_par + " " + positivo_negativo);
        }

        input.close();
    }
}
