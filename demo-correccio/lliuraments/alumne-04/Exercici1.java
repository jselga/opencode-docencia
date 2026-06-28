/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_04;
import java.util.Scanner;

/**
 *
 * @author alumne-04
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Àfrica");
        System.out.println("2 - Àsia");
        System.out.println("3 - Oceania");
        System.out.println("4 - Amèrica");
        System.out.println("5 - Europa");
        System.out.println("");
        System.out.println("Selecciona continent");
        int continent = input.nextInt();
        System.out.println("Tens targeta Premium?(s/n)");
        char c = input.next().charAt(0);
        int preuBase = 100;
        int preuAfrica = 10;
        int preuAsia = 30;
        int preuOceania = 50;
        int preuAmerica = 50;
        int preuEuropa = 70;

        if (continent == 1) {
            if (c == 's') {
                System.out.println("El teu vol costa " + ((preuBase + preuAfrica) - 50) + " Geo");

            }
            if (c == 'n') {
                System.out.println("El teu vol costa " + (preuBase + preuAfrica) + " Geo");

            }
            if (c != 's' && c != 'n') {
                System.out.println("Error");

            }

        }

        if (continent == 2) {
            if (c == 's') {
                System.out.println("El teu vol costa " + ((preuBase + preuAsia) - 50) + " Geo");

            }
            if (c == 'n') {
                System.out.println("El teu vol costa " + (preuBase + preuAsia) + " Geo");

            }
            if (c != 's' && c != 'n') {
                System.out.println("Error");

            }

        }

        if (continent == 3) {
            if (c == 's') {
                System.out.println("El teu vol costa " + ((preuBase + preuOceania) - 50) + " Geo");

            }
            if (c == 'n') {
                System.out.println("El teu vol costa " + (preuBase + preuOceania) + " Geo");

            }
            if (c != 's' && c != 'n') {
                System.out.println("Error");

            }

        }

        if (continent == 4) {
            if (c == 's') {
                System.out.println("El teu vol costa " + ((preuBase + preuAmerica) - 50) + " Geo");

            }
            if (c == 'n') {
                System.out.println("El teu vol costa " + (preuBase + preuAmerica) + " Geo");
                
            }
            if (c != 's' && c!='n') {System.out.println("Error");
                
            }
        
        }
        
        if (continent == 5) {
            if (c == 's') {
                System.out.println("El teu vol costa " + ((preuBase + preuEuropa) - 50) + " Geo");

            }
            if (c == 'n') {
                System.out.println("El teu vol costa " + (preuBase + preuEuropa) + " Geo");
                
            }
            if (c != 's' && c!='n') {System.out.println("Error");
                
            }
        
        }
        else System.out.println("No has seleccionat cap continent");

    
    
    
    
    
    
    
    
    
    
    }

}
