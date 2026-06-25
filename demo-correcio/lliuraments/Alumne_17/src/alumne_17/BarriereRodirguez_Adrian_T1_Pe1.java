/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_17;

import java.util.Scanner;

/**
 *
 * @author alumne_17
 */
public class BarriereRodirguez_Adrian_T1_Pe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("1 - Africa");
        System.out.println("2 - Asia");
        System.out.println("3 - Oceania");
        System.out.println("4 - America");
        System.out.println("5 - Europa");
        
        System.out.print("Selecciona un continent: ");
        int continent = input.nextInt();
       
        
        double preu_base = 100;
        
        double descomptes = 50;

        double geo_extra = 0;
        double preu_total = 0;
        double preu_final = 0;
        
        double descompte_confirmacio = 0;
        
        System.out.print("Tens una tergeta premium?(s/n) ");
        String descompte = input.next();
        
        if (descompte == "s") {
            descompte_confirmacio = 1;
        } else if (descompte == "n") {
            descompte_confirmacio = 2;
        }
        
        int seleccio;

        switch (continent) {
            case 1: // Africa
                seleccio = 1;
                break;
            case 2: // Asia
                seleccio = 2;
                break;
            case 3: // Oceania
                seleccio = 3;
                break;
            case 4: // America
                seleccio = 4;
                break;
            case 5: // Europa
                seleccio = 5;
                break;
            default:
                seleccio = 6;
                break;
           
        }
        
        
        if (seleccio == 1 && descompte_confirmacio == 1) {
            geo_extra = 10;
            preu_base = preu_base - descomptes;
            preu_total = preu_base + geo_extra;
        } else if (seleccio == 1 && descompte_confirmacio == 2) {
            geo_extra = 10;
            preu_base = 50;
            preu_final = preu_base + geo_extra;
        } else if (seleccio == 2 && descompte_confirmacio == 1) {
            geo_extra = 30;
            preu_total = preu_base + geo_extra;
        } else if (seleccio == 2 && descompte_confirmacio == 2) {
            geo_extra = 30;
            preu_final = preu_base + geo_extra;
        } else if (seleccio == 2 && descompte_confirmacio == 1) {
            geo_extra = 50;
            preu_base = 50;
            preu_total = preu_base + geo_extra;
        } else if (seleccio == 3 && descompte_confirmacio == 2) {
            geo_extra = 50;
            preu_final = preu_base + geo_extra;
        } else if (seleccio == 3 && descompte_confirmacio == 1) {
            geo_extra = 50;
            preu_base = 50;
            preu_total = preu_base + geo_extra;
        } else if (seleccio == 4 && descompte_confirmacio == 2) {
            geo_extra = 50;
            preu_final = preu_base + geo_extra;
        } else if (seleccio == 4 && descompte_confirmacio == 1) {
            geo_extra = 50;
            preu_base = 50;
            preu_total = preu_base + geo_extra;
        } else if (seleccio == 5 && descompte_confirmacio == 1) {
            geo_extra = 70;
            preu_base = 50;
            preu_total = preu_base + geo_extra;
        } else if (seleccio == 5 && descompte_confirmacio == 2) {
            geo_extra = 70;
            preu_final = preu_base + geo_extra;
        }
            
        System.out.println("El teu vol costa " + preu_final + " Geo.");
        
        
    }
    
}
