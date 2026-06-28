/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_13;
import java.util.Scanner;

/**
 *
 * @author alumne-13
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int continent, preu=100;
        char premium;
        boolean funciona = true; 
        
        System.out.println("1 - Àfrica");
        System.out.println("2 - Àsia");
        System.out.println("3 - Oceania");
        System.out.println("4 - Amèrica");
        System.out.println("5 - Europa\n");
        
        System.out.print("Selecciona continent: ");
        continent = input.nextInt();
        
        System.out.print("\nTens una tergeta Prèmium? (s/n) ");
        premium = input.next().toLowerCase().charAt(0);
        
        if (continent == 1) {
            preu += 10;
        } else if (continent == 2) {
            preu += 30;
        } else if (continent == 3) {
            preu += 50;
        } else if (continent == 4) {
            preu += 50;
        } else if (continent == 5) {
            preu += 70;
        } else {
            funciona = false;
            System.out.println("Error: no es un valor acceptat.");
        }
        
        
        
        if (premium == 's') {
            preu -= 50;
        }
        
        if (funciona) {
            System.out.printf("%nEl teu vol costa %d Geo.%n", preu);
        }    
    }
    
}
