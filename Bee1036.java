import java.util.Scanner;

public class Bee1036 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();

        float delta = (float)(Math.pow(b, 2) - 4*a*c);
        double raiz = Math.sqrt(delta);


        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else{
            double x1 = (float) (-b + raiz)/(2*a);
            double x2 = (float) (-b - raiz)/(2*a);

            System.out.printf("R1 = %.5f%n" , x1);
            System.out.printf("R2 = %.5f%n" , x2);
        }
        input.close();
    }   
}