package Exercicios_EstruturaRepetitivaFor;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.println("Digite o valor de x: ");
        x = sc.nextInt();
        System.out.println("");

        if(x >= 1 && x <= 1000){
            for(int i = 1; i<=x; i += 2){
                System.out.println(i);
            }
        }else{
            System.out.println("Número inteiro de 1 até 1000.");
        }

        sc.close();
    }    
}
