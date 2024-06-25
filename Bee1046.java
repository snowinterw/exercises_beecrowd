import java.util.Scanner;

public class Bee1046 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horaInicial = input.nextInt();
        int horaFinal = input.nextInt();

        if(horaInicial < horaFinal){
            int tempo = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }else if(horaInicial > horaFinal){
            int tempo = (24 - horaInicial) + horaFinal;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }else if(horaInicial == horaFinal){
            int tempo = 24;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }

        input.close();
    }
}