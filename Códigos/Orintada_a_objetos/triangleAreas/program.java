package Orintada_a_objetos.triangleAreas;

import java.util.Locale;
import java.util.Scanner;
import Orintada_a_objetos.triangleAreas.entities.Triangulo;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base do triângulo: ");
        double base = sc.nextDouble();

        System.out.print("Informe a altura do triângulo: ");
        double alt = sc.nextDouble();

        Triangulo triangulo = new Triangulo(base, alt);
        double area = triangulo.calculaArea();

        System.out.print("A área do triângulo é: " + area);

        sc.close();
    }
}
