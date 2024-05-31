import java.util.Scanner;

public class Bee1064 {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);

        int positivos = 0;
        float soma = 0, media = 0;
        float array[] = new float[6];

        for(int i = 0; i<6; i++){
            array[i] = input.nextFloat();
           
            if(array[i] > 0){
                positivos++;
                soma += array[i]; 
            }
        }
        if(positivos > 0){
            media = soma/positivos;
        }
        
        System.out.println(positivos + " valores positvos");
        System.out.printf("%.1f%n", media);

        input.close();
    }
}