import java.util.Scanner;

public class Bee1045 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();

        if (B > A && B > C) {
            float maior = A;
            A = B;
            B = maior;
        } else if (C > A && C > B) {
            float maior = A;
            A = C;
            C = maior;
        }

        if ((A > 0) && (B > 0) && (C > 0)) {
            if ((A >= (B + C)) || (B >= (A + C)) || (C >= (A + B))) {
                System.out.println("NAO FORMA TRIANGULO");
            } else {
                if ((A * A) == ((B * B) + (C * C))) {
                    System.out.println("TRIANGULO RETANGULO");
                } else if ((A * A) > ((B * B) + (C * C))) {
                    System.out.println("TRIANGULO OBTUSANGULO");
                } else if ((A * A) < ((B * B) + (C * C))) {
                    System.out.println("TRIANGULO ACUTANGULO");
                }

                if ((A == B) && (B == C)) {
                    System.out.println("TRIANGULO EQUILATERO");
                } else if ((A == B) || (B == C) || (A == C)) {
                    System.out.println("TRIANGULO ISOSCELES");
                }
            }
        }
        input.close();
    }
}