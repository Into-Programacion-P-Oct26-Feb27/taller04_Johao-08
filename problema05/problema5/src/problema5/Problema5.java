/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double netflix;
        double youtube;
        double dropbox;
        double spotify;
        String nombre;
        double descuentonetflix;
        double desceuntoyoutube;
        double descuentodropbox;
        double totaldescuento;
        double totalsindescuento;
        double ahorro;
                
        
        System.out.println("Ingrese nombres: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese valor de la suscripcion a Netflix: ");
        netflix = entrada.nextDouble();
        
        System.out.println("Ingrese valor de la suscripcion a YouTube Premium: ");
        youtube = entrada.nextDouble();
        
        System.out.println("Ingrese valor de la suscripcion a Dropbox: ");
        dropbox = entrada.nextDouble();
        
        System.out.println("Ingrese valor de la suscripcion a Spotify: ");
        spotify = entrada.nextDouble();
        
        descuentonetflix = netflix-(netflix*0.23);
        desceuntoyoutube = youtube-(youtube*0.23);
        descuentodropbox = dropbox-(dropbox*0.45);
        
        totaldescuento = descuentonetflix+desceuntoyoutube+descuentodropbox+spotify;
        
        totalsindescuento = netflix+youtube+dropbox+spotify;
        
        ahorro = totalsindescuento-totaldescuento;
        
        System.out.printf("Nombre: %s\nPrecio Netflix: $%.2f\n"
                + "Precio Netflix con descuento: $%.2f\n\n"
                + "Precio Youtube Premium: $%.2f\n"
                + "Precio Youtube Premium con descuento: $%.2f\n\n"
                + "Precio Dropbox: $%.2f\n"
                + "Precio Dropbox con descuento: $%.2f\n\n"
                + "Precio Spotify: $%.2f\n"
                + "Precio Spotify con descuento: $%.2f\n\n"
                + "Precio total sin desceunto: $%.2f\n"
                + "Ahorro: $%.2f\n"
                + "Precio total con desceunto: $%.2f\n",
                nombre,
                netflix,
                descuentonetflix,
                youtube,
                desceuntoyoutube,
                dropbox,
                descuentodropbox,
                spotify,
                spotify,
                totalsindescuento,
                ahorro,
                totaldescuento);
        
        
        
                
    }
    
}
