package Exercicios_Vetores.Pensionato;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n =  sc.nextInt();
        System.out.println("");

        rooms[] room = new rooms[10];

        for(int i = 0; i<n; i++){
            sc.nextLine();
            System.out.println("Rent #" + (i+1) + ": ");
            System.out.print("Name: ");
            String name = sc.nextLine(); 
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int numroom = sc.nextInt();
            System.out.println("");

            room[numroom] = new rooms(name, email, numroom);
        }

        System.out.println("");

        System.out.println("Busy rooms: ");
        for(int i = 0; i<room.length; i++){
            if(room[i] != null){
                System.out.println((i) + ": " + room[i].getName() + ", " + room[i]. getEmail());
            }
        }

        sc.close();
    }
}
