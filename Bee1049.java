import java.util.Scanner;
public class Bee1049 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
            String nome1 = input.nextLine();
            if(nome1.equals("vertebrado")){
                String nome2 = input.nextLine();
                if (nome2.equals("ave")) {
                    String nome3 = input.nextLine();
                    if(nome3.equals("carnivoro")){
                        System.out.println("aguia");
                    }else{
                        if(nome3.equals("onivoro")){
                            System.out.println("pomba");
                        }                    
                    }                    
                }else if (nome2.equals("mamifero")) {
                    String nome3 = input.nextLine();
                    if (nome3.equals("onivoro")) {
                        System.out.println("homem");
                    }else if(nome3.equals("herbivoro")){
                        System.out.println("vaca");
                    }
                }
            }else{
                String nome2 = input.nextLine();
                if (nome2.equals("inseto")) {
                    String nome3 = input.nextLine();
                    if(nome3.equals("hematofago")){
                        System.out.println("pulga");
                    }else{
                        if(nome3.equals("herbivoro")){
                            System.out.println("lagarta");
                        }                    
                    }                    
                }else if (nome2.equals("anelideo")) {
                    String nome3 = input.nextLine();
                    if (nome3.equals("hematofago")) {
                        System.out.println("sanguessuga");
                    }else if(nome3.equals("onivoro")){
                        System.out.println("minhoca");
                    }
                }
            } 
        input.close();
    }
}