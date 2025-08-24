package Exercicios_EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

//Calculo das areas.

public class Exercicio_06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double A, B, C;
        final double pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double Triangulo = A * C / 2;
        double Circulo = pi * (Math.pow(C, 2.0));
        double Trapezio = (A + B) * C / 2;
        double Quadrado = B * B;  
        double Retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n CIRCULO: %.3f%n TRAPEZIO: %.3f%n QUADRADO: %.3f%n RETANGULO: %.3f%n", Triangulo, Circulo, Trapezio, Quadrado, Retangulo);
    }
}
