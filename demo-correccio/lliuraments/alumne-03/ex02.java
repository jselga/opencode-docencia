/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_03;
import java.util.Scanner;

/**
 *
 * @author alumne-03
 */
public class ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double preu;
        Scanner input = new Scanner(System.in);
        System.out.println("Quants grams pesa?");
        double grams = input.nextDouble();
        System.out.println("1 - Tomaquet");
        System.out.println("2 - Ceba");
        System.out.println("3 - Pressec");
        System.out.println("4 - Patates");
        System.out.println("5 - Pinya");
        System.out.print("Selecciona Producte: ");
        int producte = input.nextInt();
        
        switch (producte) {
            case 1 -> {
                preu = (2.7468/1000)*grams;
                System.out.printf("%.0f grams de tomaquet costa %.2f", grams, preu);
            }
            case 2 -> {
                preu = (1.9846/1000)*grams;
                System.out.printf("%.0f grams de ceba costa %.2f", grams, preu);
            }
            case 3 -> {
                preu = (4.1234/1000)*grams;
                System.out.printf("%.0f grams de pressecs costa %.2f", grams, preu);
            }
            case 4 -> {
                preu = (1.5474/1000)*grams;
                System.out.printf("%.0f grams de patates costa %.2f", grams, preu);
            }
            case 5 -> {
                preu = (7.9987/1000)*grams;
                System.out.printf("%.0f grams de pinya costa %.2f", grams, preu);
            }
            default -> {
            }
        }
        
    }
    
}
