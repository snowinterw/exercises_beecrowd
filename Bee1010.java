import java.util.Scanner;
public class Bee1010 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigoPeca, numeroPeca;
        int codigoPeca2, numeroPeca2;

        double valorUnitario;
        double valorUnitario2;
        double valor_a_ser_pago;

        codigoPeca = teclado.nextInt();
        numeroPeca = teclado.nextInt();
        valorUnitario = teclado.nextDouble();

        codigoPeca2 = teclado.nextInt();
        numeroPeca2 = teclado.nextInt();
        valorUnitario2 = teclado.nextDouble();

        valor_a_ser_pago = (valorUnitario * numeroPeca) + (valorUnitario2 * numeroPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_a_ser_pago);

        teclado.close();
    }
}
