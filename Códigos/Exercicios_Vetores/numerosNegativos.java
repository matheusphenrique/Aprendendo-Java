package Exercicios_Vetores;
import java.util.Locale;
import java.util.Scanner;


public class numerosNegativos {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();

        int[] num = new int[n];

        for(int i=0; i<num.length; i++){
            System.out.print("Digite um numero inteiro: ");
            num[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int i=0; i<num.length; i++){
            if(num[i] < 0){
                System.out.println(num[i]);
            }
        }
        sc.close();
    }
}
