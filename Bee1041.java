import java.util.Scanner;

public class Bee1041 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        float valorX = input.nextFloat(); 
        float valorY = input.nextFloat(); 

        if((valorX > 0 )&&(valorY > 0 )){
            System.out.println("Q1"); 
        }else if((valorX > 0)&&(valorY < 0)){
            System.out.println("Q4"); 
        }else if ((valorX < 0)&&(valorY > 0)){
            System.out.println("Q2"); 
        }else if((valorX < 0)&&(valorY < 0)){
            System.out.println("Q3"); 
        }else if((valorX == 0)&&(valorY == 0)){
            System.out.println("Origem"); 
        }else if(valorX == 0){
            if(!(valorY == 0)){
                System.out.println("Eixo Y"); 
            }
        }else if(valorY == 0){
            if(!(valorX == 0)){
                System.out.println("Eixo X"); 
            }
        }
        input.close();
    }
}