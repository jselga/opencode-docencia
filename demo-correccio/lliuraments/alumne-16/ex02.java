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
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Quants grams pesa el producte actual? ");
        Double pes = input.nextDouble();
        double pesKg = pes / 1000;
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1 - Tomàquet (2,7468€Kg)", "2 - Ceba (1,9846€/Kg)", "3 - Préssecs (4,1234€/Kg)", "4 - Patates (1.5474€/Kg)", "5 - Pinya (7,9987€/Kg)");
        System.out.print("Selecciona el producte: ");
        int producte = input.nextInt();
        String product = "";
        double preu = 0;
        switch (producte) {
            case 1:
                preu = pesKg * 2.7468;
                product = "Tomàquet";
                break;
            case 2:
                preu = pesKg * 1.9846;
                product = "Ceba";
                break;
            case 3:
                preu = pesKg * 4.1234;
                product = "Préssecs";
                break;
            case 4:
                preu = pesKg * 1.5474;
                product = "Patates";
                break;
            case 5:
                preu = pesKg * 7.9987;
                product = "Pinya";
                break;
            default:
                throw new AssertionError();
        }
        System.out.printf("%.0fgr de %s costen %.2f€%n",pes,product,preu);
    }
}
