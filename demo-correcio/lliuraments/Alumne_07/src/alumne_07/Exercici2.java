/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_07;

import java.util.Scanner;

/**
 *
 * @author alumne_07
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double preu = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quants grams pesa el producte actual? ");
        double grams = input.nextDouble();
        System.out.println("1- Tomaquet");
        System.out.println("2- Ceba");
        System.out.println("3- Pressecs");
        System.out.println("4- Patates");
        System.out.println("5- Pinyes");
        System.out.print("Sel·lecciona el producte: ");
        int producte = input.nextInt();
        switch (producte) {
            case 1:
                preu = (grams/1000) * 2.7468;
                System.out.println(grams+" de tomaquets costen "+ String.format("%.2f", preu));
                break;
            case 2:
                preu = (grams/1000) * 1.9846;
                System.out.println(grams+" de cebes costen "+ String.format("%.2f", preu));
                break;
            case 3:
                preu = (grams/1000) * 4.1234;
                System.out.println(grams+" de pressecs costen "+ String.format("%.2f", preu));
                break;
            case 4:
                preu = (grams/1000) * 1.5474;
                System.out.println(grams+" de patates costen "+ String.format("%.2f", preu));
                break;
            case 5:
                preu = (grams/1000) * 7.9987;
                System.out.println(grams+" de pinyes costen "+ String.format("%.2f", preu));
                break;
        }
    }
    
}
