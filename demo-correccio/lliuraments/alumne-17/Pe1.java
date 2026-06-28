/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_17;
import java.util.Scanner;

/**
 *
 * @author alumne-17
 */
public class Pe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int preu = 100;

        System.out.println("1 - Àfrica");
        System.out.println("2 - Àsia");
        System.out.println("3 - Oceania");
        System.out.println("4 - Amèrica");
        System.out.println("5 - Europa");
        System.out.printf("%n");
        System.out.print("Selecciona continent: ");
        
        int c = scanner.nextInt();
        
        System.out.printf("%n");
        System.out.print("Tens una targeta Prèmium?(s/n) ");

        String x = scanner.next();
        
        System.out.printf("%n");
        
        char y = x.charAt(0);
        if (y == 's') {
            preu = preu - 50;
        }

        if (c == 1) {
            preu = preu + 10;
            System.out.println("El teu vol costa " + preu + " Geo.");
        } else if (c == 2) {
            preu = preu + 30;
            System.out.println("El teu vol costa " + preu + " Geo.");
        } else if (c == 3 || c == 4) {
            preu = preu + 50;
            System.out.println("El teu vol costa " + preu + " Geo.");
        } else {
            preu = preu + 70;
            System.out.println("El teu vol costa " + preu + " Geo.");
        }
    }

}
