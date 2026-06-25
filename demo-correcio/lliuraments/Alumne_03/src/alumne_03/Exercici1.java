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
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int preuFinal = 100;

        

        System.out.println("Escolleix un continent:\n" + "1-Àfrica\n" + "2-Asia\n" + "3-Oceania\n" + "4-America\n" + "5-Europa");
        int num = input.nextInt();

        if (num == 1) {
            preuFinal += 10;
        } else if (num == 2) {
            preuFinal += 30;
        } else if (num == 3) {
            preuFinal += 50;
        } else if (num == 4) {
            preuFinal += 50;
        } else if (num == 5) {
            preuFinal += 70;
        } else {
            System.out.println("No es cap continent valid");

            
        }
        System.out.print("Tens targeta Premium? (s/n): ");
        char caracter = input.next().charAt(0);

        if (caracter == 's') {
            preuFinal -= 50;

        }
        
System.out.println("El preu final del vol és: " + preuFinal + " Geo");
    }
}