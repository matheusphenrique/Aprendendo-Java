package Exercicios_OrientadaObjetos.rectangleArea;
import java.util.Scanner;

import Exercicios_OrientadaObjetos.rectangleArea.entities.rectangle;

import java.util.Locale;

public class program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        rectangle rectangle = new rectangle();

        System.out.println("Enter rectangle wigth and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.println(rectangle);

        sc.close();
    }
}
