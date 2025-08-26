package Exercicios_EstruturaCondicional;
import java.util.Scanner;

//Número positivo ou negativo

public class Exercicio_01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num; 

        System.out.println("Escreva um número inteiro: ");
        num = sc.nextInt();

        if(num >= 0){
            System.out.println("NAO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
