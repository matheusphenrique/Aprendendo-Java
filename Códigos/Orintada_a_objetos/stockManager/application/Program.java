package Orintada_a_objetos.stockManager.application;
import java.util.Locale;
import java.util.Scanner;
import Orintada_a_objetos.stockManager.application.entities.Products;

public class Program {
    public static void main(String[] args) {
      
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products product = new Products();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
    }
}
