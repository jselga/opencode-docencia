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
public class Pe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quants grams pesa el producte actual? ");
        double pes = scanner.nextDouble();
        
        System.out.printf("%n");
        System.out.println("1 - Tomàquet");
        System.out.println("2 - Ceba");
        System.out.println("3 - Préssecs");
        System.out.println("4 - Patates");
        System.out.println("5 - Pinya");
        System.out.printf("%n");
        
        System.out.print("Selecciona el producte: ");
        int producte = scanner.nextInt();
        
        System.out.printf("%n");
        
        if (producte == 1) {
            double preu = 2.7468;
            System.out.printf("%.0fgr de tomàquet costen %.2f€%n", pes, ((pes*0.001) * preu));
        } else if (producte == 2) {
            double preu = 1.9846;
            System.out.printf("%.0fgr de ceba costen %.2f€%n", pes, ((pes*0.001) * preu));
        } else if (producte == 3) {
            double preu = 4.1234;
            System.out.printf("%.0fgr de préssecs costen %.2f€%n", pes, ((pes*0.001) * preu));
        } else if (producte == 4) {
            double preu = 1.5474;
            System.out.printf("%.0fgr de patates costen %.2f€%n", pes, ((pes*0.001) * preu));
        } else {
            double preu = 7.9987;
            System.out.printf("%.0fgr de pinya costen %.2f€%n", pes, ((pes*0.001) * preu));
        } 
            
    }
    
}
