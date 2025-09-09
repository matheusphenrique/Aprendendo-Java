package Exercicios_OrientadaObjetos.employeeData;
import java.util.Scanner;

import Exercicios_OrientadaObjetos.employeeData.entities.Employee;

import java.util.Locale;

public class program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println();
        System.out.println("employee: " + employee);
        System.out.println();

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + employee);

        sc.close();
    }
}
