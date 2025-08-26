package Exercicios_EstruturaCondicional;
import java.util.Scanner;

//Números múltiplos entre si

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B;

        System.out.println("Digite número A: ");
        A = sc.nextInt();
        System.out.println("Digite número B: ");
        B = sc.nextInt();

        if(A % B == 0){
            System.out.println("Sao Multiplos");
        }
            else if(B % A == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }

            sc.close();
        }
    }
