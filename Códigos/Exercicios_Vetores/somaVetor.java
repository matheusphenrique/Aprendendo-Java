package Exercicios_Vetores;
import java.util.Scanner;
import java.util.Locale;

public class somaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double sum =0;

        System.out.print("Quantos numeros voca vai digitar ? ");
        int n = sc.nextInt();

        double[] num = new double[n];

        for(int i=0; i<num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.print("VALORES = ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + "  ");
        }

        System.out.println("");

        for(int i=0; i<num.length;i++){
            sum += num[i];
        }
        System.out.println("SOMA = " +sum);
        double media = sum/n;
        System.out.println("MEDIA " + media);

        sc.close();
    }
}
