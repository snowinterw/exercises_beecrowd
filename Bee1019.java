import java.util.Scanner;

public class Bee1019{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int segundos, minutos, horas, resto;

        System.out.println("digite o time em segundos");
        int time = input.nextInt();

        horas = time / 3600;
        resto = time % 3600;
        minutos = resto / 60;
        segundos = resto % 60;
        
        System.out.println(horas+" : "+minutos+" : "+segundos);

        input.close();
    }
}