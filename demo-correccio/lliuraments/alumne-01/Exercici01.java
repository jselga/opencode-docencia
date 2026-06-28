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
public class Exercici01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int preuFinal = 100;
        
        System.out.println("Selecciona un continent de destí");
        System.out.println("1 - Africa\n2 - Asia\n3 - Oceania\n4 - America\n5 - Europa");
        int continent = input.nextInt();
        
        System.out.println("Tens targeta premium?\n1. Si\n2. No");
        int premium = input.nextInt();
        
        if (premium == 1) {
            preuFinal = preuFinal - 50;
        }
        
        if (continent == 1) {
            preuFinal = preuFinal + 10;
        } else if (continent == 2) {
            preuFinal = preuFinal + 30;
        } else if (continent == 3) {
            preuFinal = preuFinal + 50;
        } else if (continent == 4) {
            preuFinal = preuFinal + 50;
        } else if (continent == 5) {
            preuFinal = preuFinal + 70;
        } else {
            System.out.println("Continent no existeix.");
        }
        
        System.out.println("El teu vol costa " + preuFinal + "Geo");
    }
    
}
