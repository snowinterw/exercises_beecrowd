import java.util.Scanner;

public class Bee1043 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float perimetro;

        float valor1 = input.nextFloat();
        float valor2 = input.nextFloat();
        float valor3 = input.nextFloat();

        if(valor1 + valor2 > valor3 && valor2 + valor3 > valor1 && valor3 + valor1 > valor2){
            perimetro = valor1 + valor2 + valor3;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        }else{
           float areaaa = ((valor1 + valor2)*valor3)/2;
           System.out.printf("Area = %.1f%n", areaaa);
        }
        input.close();
    }    
}