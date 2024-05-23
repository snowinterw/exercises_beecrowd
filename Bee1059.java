import java.util.Scanner;

public class Bee1059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 100;

        if(numero > 0){
                int contador = 0;
                while (contador < numero) {
                    contador ++;  
                    int parOuImpar = contador % 2;
                    if(parOuImpar == 0){
                        System.out.println(contador);
                    }
                }

        input.close();
        }
    }    
}