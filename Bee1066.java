import java.util.Scanner;

    public class Bee1066{
        public static void main (String []args){
            Scanner input = new Scanner(System.in);

            int[] valores = new int[5];
            
             valores[0] = input.nextInt();
             valores[1] = input.nextInt();
             valores[2] = input.nextInt();
             valores[3] = input.nextInt();
             valores[4] = input.nextInt();

            int contadorPositivo = 0, contadorNegativo = 0, contadorImpar = 0, contadorPar = 0; 

            for(int i = 0; i < valores.length; i++){
                if((valores[i] % 2) == 0){
                    contadorPar++;
                }
            }
            for(int i = 0; i < valores.length; i++){
                if((valores[i] % 2) != 0){
                    contadorImpar++;
                }
            }
            for(int i = 0; i < valores.length; i++){
                if(valores[i] > 0){
                    contadorPositivo++;
                }
            }
            for(int i = 0; i < valores.length; i++){
                if(valores[i] < 0){
                    contadorNegativo++;
                }
            }

            System.out.println(contadorPar + "valor(es) par(es)");
            System.out.println(contadorImpar + "valor(es) impar(es)");
            System.out.println(contadorPositivo + "valor(es) positivo(s)");
            System.out.println(contadorNegativo + "valor(es) negativo(s)");
            input.close();
        }
    }