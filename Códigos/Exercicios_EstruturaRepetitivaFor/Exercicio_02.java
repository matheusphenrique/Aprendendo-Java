package Exercicios_EstruturaRepetitivaFor;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        int num = 0, in = 0, out = 0;

        System.out.println("Digite quantos valores serão lidos: ");
        n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Digite o numero " + (i+1) + ": ");
            num = sc.nextInt();
            if(num >= 10 && num <= 20){
                in += 1;
            }else{
                out += 1;
            }
        }

        System.out.println(in + " in " );
        System.out.println(out + " out" );

        sc.close();
    }
}
