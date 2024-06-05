import java.util.Scanner;

public class Bee1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double N = input.nextDouble();
        
        System.out.println("NOTAS: ");
        int notas100 = (int) (N / 100);
        System.out.printf("%d nota(s) de R$ 100,00%n", notas100);
        N = N % 100;
        int notas50 = (int) (N / 50);
        System.out.printf("%d nota(s) de R$ 50,00%n", notas50);
        N = N % 50;
        int notas25 = (int) (N / 25);
        System.out.printf("%d nota(s) de R$ 25,00%n", notas25);
        N = N % 25;
        int notas10 = (int) (N / 10);
        System.out.printf("%d nota(s) de R$ 10,00%n", notas10);
        N = N % 10;
        int notas5 = (int) (N / 5);
        System.out.printf("%d nota(s) de R$ 5,00%n", notas5);
        N = N % 5;
        int notas2 = (int) (N / 2);
        System.out.printf("%d nota(s) de R$ 2,00%n", notas2);
        N = N % 2;


        System.out.println("MOEDAS: ");
        int notas1 = (int) (N / 1);
        System.out.printf("%d moedas(s) de R$ 1,00%n", notas1);
        N = N % 1;
        int notas050 = (int) (N / 0.50);
        System.out.printf("%d moedas(s) de R$ 0.50,00%n", notas050);
        N = N % 0.50;
        int notas025 = (int) (N / 0.25);
        System.out.printf("%d moedas(s) de R$ 0.25,00%n", notas025);
        N = N % 0.25;
        int notas010 = (int) (N / 0.10);
        System.out.printf("%d moedas(s) de R$ 0.10,00%n", notas010);
        N = N % 0.10;
        int notas05 = (int) (N / 0.05);
        System.out.printf("%d moedas(s) de R$ 0.05,00%n", notas05);
        N = N % 0.05;
        int notas01 = (int) (N / 0.01);
        System.out.printf("%d moedas(s) de R$ 0.01,00%n", notas01);
        N = N % 0.01;

        input.close();
    }
}