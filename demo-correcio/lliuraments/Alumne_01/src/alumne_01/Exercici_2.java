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
public class Exercici_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//David Martinez Vivo
        Scanner sc = new Scanner(System.in);

        System.out.println("Quants grams pesa el producte actual? ");
        double grams = sc.nextDouble();

        System.out.println("1-Tomaquet");
        System.out.println("2-Ceba");
        System.out.println("3-Pressecs");
        System.out.println("4-Patates");
        System.out.println("5-Pinya");
        
        System.out.println("Selecciona el producte: ");
        int producte = sc.nextInt();
        System.out.println("");
        
        
        if (producte == 1) {
            System.out.printf("%.0fgr de tomaquet costen %.2f€",grams, (grams*2.7468/1000));
        } else if (producte == 2) {
            System.out.printf("%.0fgr de ceba costen %.2f€",grams, (grams*1.9846/1000));
        } else if (producte == 3) {
            System.out.printf("%.0fgr de pressec costen %.2f€",grams, (grams*4.1234/1000));
        } else if (producte == 4) {
            System.out.printf("%.0fgr de patates costen %.2f€",grams, (grams*1.5474/1000));
        } else if (producte == 5) {
            System.out.printf("%.0fgr de pinya costen %.2f€",grams, (grams*7.9987/1000));
        }

    }

}
