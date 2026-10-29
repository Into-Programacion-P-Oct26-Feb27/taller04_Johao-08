/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double teclado;
        double raton;
        double pantalla;
        String nombre;
        
        double costoBase;
        double costo15;
        double total;
        
        
        System.out.println("Ingrese nombres: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese valor de la CPU: ");
        cpu = entrada.nextDouble();
        
        System.out.println("Ingrese valor del teclado: ");
        teclado = entrada.nextDouble();
        
        System.out.println("Ingrese valor del raton: ");
        raton = entrada.nextDouble();
        
        System.out.println("Ingrese valor de la pantalla: ");
        pantalla = entrada.nextDouble();
        
        costoBase = cpu+raton+pantalla+teclado;
        
        costo15 = costoBase*0.15;
        
        total = costoBase+costo15;
        
        System.out.printf(" reporte: \n Nombre cliente: %s\n");
        
    }
                
      
    }
    

