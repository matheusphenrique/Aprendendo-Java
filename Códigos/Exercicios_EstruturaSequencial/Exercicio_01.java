package Exercicios_EstruturaSequencial;

//Tela de Soma de dois valores.

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int x, y, soma;

        System.out.println("Escreva o primeiro número: ");
        x = sc.nextInt();
        System.out.println("Escreva o segundo número: ");
        y = sc.nextInt();

        soma = x + y;
        System.out.println("SOMA = " + soma);

        sc.close();

    }
}
