import java.util.Scanner;

public class Bee1042 {
    public static void main(String args[]){
        Scanner input =new Scanner (System.in);

        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        int maior, menor, meio;

        if((valor1 > valor2)&&(valor1 > valor3)){
            maior = valor1;
            if(valor2 > valor3){
                meio = valor2;
                menor = valor3;
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(" ");
            }else{
                meio = valor3;
                menor = valor2;
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(" ");
            }
        }else if((valor2 > valor1)&&(valor2 > valor3)){
            maior = valor2;
            if(valor1 > valor3){
                meio = valor1;
                menor = valor3;
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(" ");
            }else{
                meio = valor3;
                menor = valor1;
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(" ");
            }
        }else if((valor3 > valor1)&&(valor3 > valor2)){
            maior = valor3;
            if(valor1 > valor2){
                meio = valor1;
                menor = valor2;
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(" ");
            }else{
                meio = valor2;
                menor = valor1;
                System.out.println(menor);
                System.out.println(meio);
                System.out.println(maior);
                System.out.println(" ");
            }
        }
        System.out.println(valor1);
        System.out.println(valor2);
        System.out.println(valor3);

        input.close();
    }
}