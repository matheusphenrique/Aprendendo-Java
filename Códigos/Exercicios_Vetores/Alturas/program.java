package Exercicios_Vetores.Alturas;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double media =0, porcentagem = 0;
        double menores = 0;

        System.out.print("Quantas pessoas serao digitadas ? ");
        int n = sc.nextInt();

        pessoas[] pessoas = new pessoas[n];

        for(int i=0; i<pessoas.length; i++){
            sc.nextLine();
            System.out.println("Dados da " +(i+1)+ "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new pessoas(nome, idade, altura);
        }

        for(int i=0; i<pessoas.length; i++){
            media += pessoas[i].getAltura();
        }
        System.out.println();
        System.out.println("Altura média: " + (media/n));



        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                menores += 1;
            }
        }

        porcentagem = menores / n * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
