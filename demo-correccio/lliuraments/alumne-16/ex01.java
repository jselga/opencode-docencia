/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_16;
import java.util.Scanner;

/**
 *
 * @author alumne-16
 */
public class ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1 - Àfrica", "2 - Àsia", "3 - Oceania", "4 - Amèrica", "5 - Europa");
        System.out.print("Selecciona continent: ");
        int continent = input.nextInt();
        int preu = 0;
        if (continent == 1) {
            preu = 10;
        } else if (continent == 2) {
            preu = 30;
        } else if (continent == 3) {
            preu = 50;
        } else if (continent == 4) {
            preu = 70;
        } else {
            System.out.println("Error");
        }
        System.out.print("Tens una targeta Prèmium? (s/n) ");
        String premium = input.next();
        char prem = premium.charAt(0);
        if (prem == 's') {
            System.out.printf("El teu vol costa %d Geo.%n", preu + 50);
        } else {
            System.out.printf("El teu vol costa %d Geo.%n", preu + 100);
        }
    }

}
