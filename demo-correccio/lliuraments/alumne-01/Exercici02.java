/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_01;
import java.util.Scanner;

/**
 *
 * @author alumne-01
 */
public class Exercici02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double preuTomaquet = 2.7468;
        double preuCeba = 1.9846;
        double preuPressecs = 4.1234;
        double preuPatates = 1.5474;
        double preuPinya = 7.9987;
        
        System.out.println("Quants grams pesa el producte actual?");
        double pes = input.nextDouble();
        System.out.println("Selecciona el producte:");
        System.out.println("1 - Tomaquet\n2 - Ceba\n3 - Préssecs\n4 - Patates\n5 - Pinya");
        int producte = input.nextInt();
        
        double preuFinal = 0;
        
        switch (producte) {
            case 1:
                preuFinal = preuTomaquet * pes;
                break;
            case 2:
                preuFinal = preuCeba * pes;
                break;
            case 3:
                preuFinal = preuPressecs * pes;
                break;
            case 4:
                preuFinal = preuPatates * pes;
                break;
            case 5:
                preuFinal = preuPinya * pes;
                break;
            default:
                System.out.println("Producte desconegut.");
                break;
        }
        
        double preuCentesimes = (preuFinal/1000);
         System.out.printf("El preu final és: %.2f €",preuCentesimes);
    }
    
}
