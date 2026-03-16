package Orintada_a_objetos.triangleAreas.entities;

public class Triangulo {
    
    private double base;
    private double alt;

    public Triangulo(double base, double alt){
        this.base = base;
        this.alt = alt;
    }

    public double calculaArea(){
        return (base * alt) / 2;
    }
}
