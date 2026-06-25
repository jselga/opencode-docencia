/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_01;

import java.util.Scanner;

/**
 *
 * @author alumne_01
 */
public class Exercici_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //David Martinez Vivo
        Scanner sc = new Scanner(System.in);

        int pBase = 100;
        int descompte = 50;
        
        
        System.out.println("1 - Africa");
        System.out.println("2 - Asia");
        System.out.println("3 - Oceania");
        System.out.println("4 - America");
        System.out.println("5 - Europa\n");
        
        System.out.println("Selecciona continent: ");
        int continent = sc.nextInt();
        
        System.out.println("\nTens una targeta premium?(s/n) ");
        char premium = sc.next().charAt(0);
        
        if (premium == 's') {
            pBase = pBase - descompte;
        }
        

        if (continent == 1) {
            System.out.println("\nEl teu vol costa " + (pBase+10) + "Geo.");
        } else if (continent == 2) {
            System.out.println("\nEl teu vol costa " + (pBase+30) + "Geo.");
        } else if (continent == 3) {
            System.out.println("\nEl teu vol costa " + (pBase+50) + "Geo.");
        } else if (continent == 4) {
            System.out.println("\nEl teu vol costa " + (pBase+50) + "Geo.");
        } else if (continent == 5) {
            System.out.println("\nEl teu vol costa " + (pBase+70) + "Geo.");
        }
    }

}
