import java.util.Scanner;

public class Bee1060 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contadorPositivos = 0;
        double vetorValor[] = new double[6];

        for(int i=0; i<6; i++){
            vetorValor[i] = input.nextDouble();
            if(vetorValor[i] > 0){
                contadorPositivos++;
            }
        }
        System.out.println(contadorPositivos + " valores positivos");
        input.close();
    }
}