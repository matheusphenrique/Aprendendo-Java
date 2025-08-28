package Exercicios_EstruturaRepetitivaWhile;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;
        int operacao = sc.nextInt();

        while(operacao != 4){
            if(operacao == 1){
                System.out.println("Alcool +1");
                alcool += 1;
                operacao = sc.nextInt();
            }else if(operacao == 2){
                System.out.println("Gasolina +1");
                gasolina += 1;
                operacao = sc.nextInt();
            }else if(operacao == 3){
                System.out.println("Diesel +1");
                diesel += 1;
                operacao = sc.nextInt();
            }else{
                System.out.println("Operação Invalida");
                operacao = sc.nextInt();
            }
        }

         System.out.println("MUITO OBRIGADO");
         System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
        
        sc.close();
    }
}
