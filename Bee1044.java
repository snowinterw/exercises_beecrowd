import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int divisao = 0, resto;

        if(valor1 > valor2){
           divisao = valor1/valor2;
           resto = valor1%valor2;

        }else{
            divisao = valor2/valor1;
            resto = valor2%valor1;
        }

        if(resto == 0){
            System.out.println("Sao multiplos");
        }else{
            System.out.println("Nao sao multiplos");
        }
        input.close();
    }
}