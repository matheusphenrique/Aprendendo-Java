import java.util.Scanner;

public class Entrada_de_dados {
    public static void main(String[] args) {
         
        char x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite algum número: ");
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}
