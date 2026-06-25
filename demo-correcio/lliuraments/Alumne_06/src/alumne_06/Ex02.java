/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_06;

import java.util.Scanner;

/**
 *
 * @author alumne_06
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Quants grams pesa el producte actual? ");
        Scanner input = new Scanner(System.in);
        int grams = input.nextInt();
        
        System.out.println("Selecciona el producte: ");
        System.out.printf("1 - Tomàquet%n2 - Ceba%n3 - Préssecs%n4 - Patates%n5 - Pinya%n");
        Scanner input2 = new Scanner(System.in);
        int producte = input2.nextInt();
        
        switch (producte){
            case 1:
                System.out.printf("%d grams de tomàquet costen %.2f €%n ", grams, (grams/1000)*2.7468);
                break;
            case 2:
                System.out.printf("%d grams de tomàquet costen %.2f €%n ", grams, (grams/1000)*1.9846);
                break;
            case 3:
                System.out.printf("%d grams de tomàquet costen %.2f €%n ", grams, (grams/1000)*4.1234);
                break;
            case 4:
                System.out.printf("%d grams de tomàquet costen %.2f €%n ", grams, (grams/1000)*1.5474);
                break;
            case 5:
                System.out.printf("%d grams de tomàquet costen %.2f €%n ", grams, (grams/1000)*7.9987);
                break;
        }
    }
    
}
