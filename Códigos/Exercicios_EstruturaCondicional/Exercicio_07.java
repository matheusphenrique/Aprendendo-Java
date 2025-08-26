package Exercicios_EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Digite valor de x: ");
        x = sc.nextDouble();
        System.out.println("Digite valor de y: ");
        y = sc.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("ORIGEM");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x < 0 && y < 0){
            System.out.println("Q3"); 
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x == 0){
                System.out.println("Ponto sobre Eixo X.");
        }else if(y == 0){
                System.out.println("Ponto sobre eixo Y.");
            }

            sc.close();
        }
    }    
