/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_13;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author alumne-13
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double pes, preu = 0;
        int producte;
        String nomProducte = " ";
        boolean valorOk = true;
        
        System.out.print("Quants grams pesa el producte actual? ");
        pes = input.nextDouble();
        
        double pesKg = pes/1000;
        
        System.out.println("\n1 - Tomàquet");
        System.out.println("2 - Ceba");
        System.out.println("3 - Préssecs");
        System.out.println("4 - Patates");
        System.out.println("5 - Pinya");
        
        System.out.print("\nSelecciona el producte: ");
        producte = input.nextInt();
        
        switch (producte){
            case 1:
                preu = pesKg * 2.7468;
                nomProducte = "Tomàquet";
                break;
            case 2:
                nomProducte = "Ceba";
                preu = pesKg * 1.9846;
                break;
            case 3:
                nomProducte = "Préssecs";
                preu = pesKg * 4.1234;
                break;
            case 4:
                nomProducte = "Patates";
                preu = pesKg * 1.5474;
                break;
            case 5:
                nomProducte = "Pinya";
                preu = pesKg * 7.9987;
                break;
            default:
                valorOk = false;
                System.out.println("Error: no es un valor acceptat.");
        }
        
        if (valorOk) {
            System.out.printf(Locale.ENGLISH, "\n%.1fgr de %s costen %.2f€\n", pes, nomProducte, preu);
            // He decidit donar un decimal en el pes inicial del producte
        }
                
    }
    
}
