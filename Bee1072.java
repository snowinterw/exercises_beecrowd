import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        int vetor[] = new int[valor];
        int contadorIn = 0, contadorOut = 0;

        for(int i =0; i < vetor.length; i++){
                vetor[i] = input.nextInt();
            if(vetor[i] > 9 && vetor[i] < 21){
                contadorIn++;
            }else{
                contadorOut++;
            }
        }
        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");
        input.close();
    }
}







