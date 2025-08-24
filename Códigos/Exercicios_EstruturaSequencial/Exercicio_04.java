package Exercicios_EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

//Salário de funcionarios.

public class Exercicio_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numfunc, horas;
        double SalarioHora, Salario;

        System.out.println("Digite o número do funcionario: ");
        numfunc = sc.nextInt();
        System.out.println("Digite números de horas trabalhados: ");
        horas = sc.nextInt();
        System.out.println("Valor que recebe por hora: ");
        SalarioHora = sc.nextDouble();

        Salario = horas * SalarioHora;

        System.out.println("NUMBER = " + numfunc);
        System.out.println("SALARY = U$ " + Salario);

        sc.close();
    }
}
