package Exercicios_EstruturaRepetitivaWhile;
import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        final int senha = 2002;

        int cod = sc.nextInt();

        while(cod != senha){
            System.out.println("Senha Invalida");
            cod = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
