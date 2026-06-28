/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_08;
import java.util.Scanner;

/**
 *
 * @author alumne-08
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int preu = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("1- Africa\n"
                +          "2- Asia\n"
                +          "3- Oceania\n"
                +          "4- America\n"
                +          "5- Europa\n"
                + "Selecciona continent: ");
        int num = input.nextInt();
        System.out.print("Tens una targeta Premium?(s/n) ");
        String text = input.next();
        char targeta = text.charAt(0);
        if (num == 1 && targeta == 's') {
            preu = (100+10)-50;
            System.out.println("El teu vol costa: "+preu);
        }else if (num == 1 && targeta == 'n') {
            preu = 100 + 10;
            System.out.println("El teu vol costa: "+preu);
        }
         
        if (num == 2 && targeta == 's') {
            preu = (100+30)-50;
            System.out.println("El teu vol costa: "+preu);
        } else if (num == 2 && targeta == 'n'){
            preu = 100 + 30;
            System.out.println("El teu vol costa: "+preu);
        }
        if (num == 3 && targeta == 's') {
            preu = (100+50)-50;
            System.out.println("El teu vol costa: "+preu);
        } else if (num == 3 && targeta == 'n') {
            preu = 100 + 50;
            System.out.println("El teu vol costa: "+preu);
        }
        
        
        if (num == 4 && targeta == 's') {
            preu = (100+50)-50;
            System.out.println("El teu vol costa: "+preu);
        } else if (num == 4 && targeta == 'n') {
            preu = 100 + 50;
            System.out.println("El teu vol costa: "+preu);
        }
        
        
        if (num == 5 && targeta == 's') {
            preu = (100+70)-50;
            System.out.println("El teu vol costa: "+preu);
        } else if (num == 5 && targeta == 'n') {
            preu = 100 + 70;
            System.out.println("El teu vol costa: "+preu);
        }
        
        
        
    }
    
}
