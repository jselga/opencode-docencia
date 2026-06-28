/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_15;
import java.util.Scanner;
/**
 *
 * @author alumne-15
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Benvingut!");
        System.out.println("Quin producte estàs pesant?");
        System.out.println("");
        System.out.println("1. Tomàquet");
        System.out.println("2. Ceba");
        System.out.println("3. Préssecs");
        System.out.println("4. Patates");
        System.out.println("5. Pinya");
        System.out.println("");
        System.out.print("Producte: ");
        int p = input.nextInt();
        System.out.println("");
        System.out.print("Introdueix pes del producte en grams: ");
        double pes = input.nextDouble();
        
        
        if (p == 1){
            System.out.printf("El preu a pagar és: %.2f euros %n", (2.7468 * (pes / 1000)));
        } else if (p == 2){
            System.out.printf("El preu a pagar és: %.2f euros %n", (1.9846 * (pes / 1000)));
        } else if (p == 3){
            System.out.printf("El preu a pagar és: %.2f euros %n", (4.1234 * (pes / 1000)));
        } else if (p == 4){
            System.out.printf("El preu a pagar és: %.2f euros %n", (1.5474 * (pes / 1000)));
        } else if (p == 5){
            System.out.printf("El preu a pagar és: %.2f euros %n", (7.9987 * (pes / 1000)));
        } else {
            System.out.println("Introdueix un nombre de producte vàlid");
        }
    
}
}
