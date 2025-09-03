package Exercicios_OrientadaObjetos.rectangleArea.entities;

public class rectangle {
    
    public double width;
    public double Height;

    public double area(){
        double area = width * Height;
        return area;
    }

    public double perimeter(){
        double perimeter = width * 2 + Height * 2;
        return perimeter;
    }

    public double diagonal(){
        double diagonal = Math.sqrt(width * width + Height * Height);
        return diagonal;
    }

    public String toString(){
        return "AREA = " + String.format("%.2f%n", area())
        + "PERIMETER = " + String.format("%.2f%n", perimeter())
         + "DIAGONAL = " + String.format("%.2f", diagonal());
    }
}
