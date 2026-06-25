/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_12;

import java.util.Scanner;

/**
 *
 * @author alumne_12
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int descompte = 0;
        int preu = 0;
        // Afegim el scanner
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Africa");
        System.out.println("2 - Asia");
        System.out.println("3 - Oceania");
        System.out.println("4 - America");
        System.out.println("5 - Europa");
        // ara preguntem al usuari
        System.out.print("Selecciona continent: ");
        int continent = input.nextInt();
        System.out.println("Tens targeta premium? (s/n)");
        String premium = input.next();
        if ("s".equals(premium)){
            descompte = 50;
        }else {
            descompte = 0;
        }
        if (continent == 1) {
            preu = 100+10-descompte;
            System.out.println("El teu vol costa " + preu + "Geo.");
            
        }else if (continent == 2) {
            preu = 100+30-descompte;
            System.out.println("El teu vol costa " + preu + "Geo.");
            
        }else if (continent == 3) {
            preu = 100+50-descompte;
            System.out.println("El teu vol costa " + preu + "Geo.");
            
        }else if (continent == 4) {
            preu = 100+50-descompte;
            System.out.println("El teu vol costa " + preu + "Geo.");
            
        }else if (continent == 5) {
            preu = 100+70-descompte;
            System.out.println("El teu vol costa " + preu + "Geo.");
            
        }
    }
    
}
