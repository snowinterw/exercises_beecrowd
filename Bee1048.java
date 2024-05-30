import java.util.Scanner;

public class Bee1048{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salario = input.nextFloat();
        float novoSalario, reajusteGanho;
        int percentual;

        if (salario >= 0 && salario <= 400.0) {
            percentual = 15;
            reajusteGanho = (percentual / 100.0f) * salario;
        } else if (salario >= 400.1 && salario <= 800.0) {
            percentual = 12;
            reajusteGanho = (percentual / 100.0f) * salario;
        } else if (salario >= 800.1 && salario <= 1200.0) {
            percentual = 10;
            reajusteGanho = (percentual / 100.0f) * salario;
        } else if (salario >= 1200.1 && salario <= 2000.0) {
            percentual = 7;
            reajusteGanho = (percentual / 100.0f) * salario;
        } else {
            percentual = 4;
            reajusteGanho = (percentual / 100.0f) * salario;
        }

        novoSalario = salario + reajusteGanho;
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajusteGanho);
        System.out.printf("Em percentual: %d %%%n", percentual);

        input.close();
    }
}
