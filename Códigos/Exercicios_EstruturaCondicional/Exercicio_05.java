package Exercicios_EstruturaCondicional;
import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int codigo, quant;
        double valorTotal;

        System.out.println("Digite o Código do produto: ");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade desse Item: ");
        quant = sc.nextInt();

        if(codigo == 1){
            valorTotal = quant * 4.00;
        }else if(codigo == 2){
            valorTotal = quant * 4.50;
        }else if(codigo == 3){
            valorTotal = quant * 5.00;
        }else if(codigo == 4){
            valorTotal = quant * 2.00;
        }else if(codigo == 5){
            valorTotal = quant * 1.50;
        }else{
            System.out.println("Código não encontrado! ): "); 
            valorTotal = 0;
        }

        System.out.printf("Total: R$ %.2f%n", valorTotal);
        sc.close();
    }
}
