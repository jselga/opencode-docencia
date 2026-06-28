/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_07;
import java.util.Scanner;

/**
 *
 * @author alumne-07
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int preu = 100;
        System.out.println("Selecciona el continent de destinació: ");
        System.out.printf("1 - Àfrica%n2 - Asia%n3 - Oceania%n4 - Amèica%n5 - Europa%n");
        Scanner input = new Scanner(System.in);
        int continent = input.nextInt();
        
        System.out.println("Tens una targeta Prèmium? (s/n) ");
            Scanner input2= new Scanner(System.in);
            String lletra = input2.nextLine();
            char targeta = lletra.charAt(0);
        
        
        
        if (continent == 1){
            if (targeta == 's'){
                preu = preu + 10 - 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            }else {
                preu = preu + 10;
                System.out.printf("El preu és: %d Geo%n", preu);
            }
         
        }else if (continent == 2){
            if (targeta == 's') {
                preu = preu + 30 - 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            } else {
                preu = preu + 30;
                System.out.printf("El preu és: %d Geo%n", preu);
            }
        
         
        }else if (continent == 3){
            if (targeta == 's'){
                preu = preu + 50 - 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            }else {
                preu = preu + 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            }
        
        }else if (continent == 4){
            if (targeta == 's'){
                preu = preu + 50 - 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            }else {
                preu = preu + 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            }
            
        }else{
            if (targeta == 's'){
                preu = preu + 70 - 50;
                System.out.printf("El preu és: %d Geo%n", preu);
            }else {
                preu = preu + 70;
                System.out.printf("El preu és: %d Geo%n", preu);
            }
   
        }
    
    }  
}       
