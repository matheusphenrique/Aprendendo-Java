package Exercicio_Matriz;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 'n' number: ");
        int n = sc.nextInt();
        System.out.println("Enter the 'm' number: ");
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.println("Enter the ["+i+"] ["+j+"] value: ");
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
        }
        
        System.out.println("choose a number: ");
        int num = sc.nextInt();


        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == num){
                    System.out.println("Position "+i+","+j+": ");

                    if(j>0){
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if(i>0){
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if(j < mat[i].length-1){
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if(i<mat.length-1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
       
    }
}
