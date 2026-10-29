/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double total;

        System.out.println("Ingrese nombre del proyecto 1");
        proyecto1 = entrada.nextLine();
        System.out.println("Ingrese gasto mensual del proyecto 1");
        gasto1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese nombre del proyecto 2");
        proyecto2 = entrada.nextLine();
        System.out.println("Ingrese gasto mensual del proyecto 2");
        gasto2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Ingrese nombre del proyecto 3");
        proyecto3 = entrada.nextLine();
        System.out.println("Ingrese gasto mensual del proyecto 3");
        gasto3 = entrada.nextDouble();
        entrada.nextLine();

        total = gasto1 + gasto2 + gasto3;

        System.out.printf(" -------------------- \n "
                + "CONTROL DE GASTOS PROYECTO \n Proyectos:\n "
                + "-------------------- \n 1. %s: $ %.2f \n 2. %s: $ %.2f \n"
                + " 3. %s: $ %.2f \n -------------------- \n"
                + " GASTO TOTAL MENSUAL: $ %.2f\n",
                proyecto1,
                gasto1,
                proyecto2,
                gasto2,
                proyecto3,
                gasto3,
                total);

    }

}
