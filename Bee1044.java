import java.util.Scanner;

public class Bee1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        input.close();
    }
}
