/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_04;
import java.util.Scanner;

/**
 *
 * @author alumne-04
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quants grams pesa el producte?");
        int pesProducte = input.nextInt();
        System.out.println("1 - Tomaquet");
        System.out.println("2 - Ceba");
        System.out.println("3 - Pressecs");
        System.out.println("4 - Patates");
        System.out.println("5 - Pinya");
        System.out.println("");
        System.out.println("Selecciona el producte");
        
        int producte = input.nextInt();
        switch (producte) {
            case 1:
                System.out.printf(pesProducte + " gr de tomaquet costen %.2f€%n" , 2.7468/1000*pesProducte );
                break;
            case 2:
                System.out.printf(pesProducte + " gr de ceba costen %.2f€%n" , 1.9846/1000*pesProducte );
                break;
            case 3:
                System.out.printf(pesProducte + " gr de pressecs costen %.2f€%n" , 4.1234/1000*pesProducte );
                break;
            case 4:
                System.out.printf(pesProducte + " gr de patates costen %.2f€%n" , 1.5474/1000*pesProducte );
                break;
            case 5:
                System.out.printf(pesProducte + " gr de pinya costen %.2f€%n" , 7.9987/1000*pesProducte );
                break;
            
            default:
                throw new AssertionError();
        }
        
    
    
    
    
    
    
    
    
    
    }
    
}
