/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_03;

import java.util.Scanner;

/**
 *
 * @author alumne_03
 */
public class exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tomaquet = 0;
        double ceba = 0;
        double presecs = 0;
        double patates = 0;
        double pinya = 0;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quants grams pesa el producte actual: ");
        int pes = input.nextInt();

        System.out.println("1-Tomaquet");
        System.out.println("2-Ceba");
        System.out.println("3-Presecs");
        System.out.println("4-Patates");
        System.out.println("5-Pinya");
        int fruita = input.nextInt();

        if (fruita == 1) {
            tomaquet = pes * 2.7468;
            double preut = tomaquet / 1000;
            System.out.println(pes +"gr de tomaquet costen " +preut +"€");
        } else if (fruita == 2) {
            ceba = pes * 1.9846;
            double preuc = ceba / 1000;
            System.out.println(pes +"gr de ceba costen " +preuc +"€");
        } else if (fruita == 3) {
            presecs = pes * 4.1234;
            double preup = presecs / 1000;
            System.out.println(pes +"gr de presecs costen " +preup +"€");
        } else if (fruita == 4) {
            patates = pes * 1.5474;
            double preupa = patates / 1000;
            System.out.println(pes +"gr de patates costen " +preupa +"€");
        } else if (fruita == 5) {
            pinya = pes * 7.9987;
            double preupi = pinya / 1000;
            System.out.println(pes +"gr de pinya costen " +preupi +"€");

        } else {
            System.out.println("No es cap fruita valida");
        }

    }
}