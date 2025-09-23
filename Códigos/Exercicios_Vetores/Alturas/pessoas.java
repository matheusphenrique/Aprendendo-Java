package Exercicios_Vetores.Alturas;

public class pessoas {
    
    private String nome;
    private int idade;
    private double altura;


    public pessoas(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
       return this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public int setIdade(int idade){
       return this.idade = idade;
    }

    public double getAltura(){
        return altura;
    }

    public double setAltura(double altura){
       return this.altura = altura;
    }
}
