/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_15;
import java.util.Scanner;
/**
 *
 * @author alumne-15
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Benvingut a la RyanFly");
        System.out.println("El preu base de tots els vols és de 100 Geo");
        System.out.println("Cada continent té un cost extra");
        System.out.println("La targeta Prémium comporta una rebaixa de preu de 50 Geo");
        
        System.out.println("A quin continent viatges?");
        System.out.println("1. Àfrica (10 Geo)");
        System.out.println("2. Àsia (30 Geo)");
        System.out.println("3. Oceania (50 Geo)");
        System.out.println("4. Amèrica (50 Geo)");
        System.out.println("5. Europa (70 Geo)");
        System.out.print("Continent: ");
        int continent = input.nextInt();
        
        
        if (continent == 1){
            System.out.println("Àfrica!");
            System.out.print("Tens targeta Prémium?(s/n) ");
            //System.out.println("1. Si");
            //System.out.println("2. No");            
            //int t = input.nextInt();
            String t = input.next();
            if (t.equals("s")){
            System.out.println("El preu final del teu vol és: " + (100 + 10 - 50) + " Geo");
            } else if (t.equals("n")){
                System.out.println("El preu final del teu vol és: " + (100 + 10) + " Geo");
            }
        } else if (continent == 2){
            System.out.println("Àsia!");
            System.out.print("Tens targeta Prémium?(s/n) ");
            //System.out.println("1. Si");
            ///System.out.println("2. No");
            //int t = input.nextInt();
            String t = input.next();
            if (t.equals("s")){
            System.out.println("El preu final del teu vol és: " + (100 + 30 - 50) + " Geo");
            } else if (t.equals("n")){
                System.out.println("El preu final del teu vol és: " + (100 + 30) + " Geo");
            }
        } else if (continent == 3){
            System.out.println("Oceania!");
            System.out.print("Tens targeta Prémium?(s/n) ");
            //System.out.println("1. Si");
            //System.out.println("2. No");
            //int t = input.nextInt();
            String t = input.next();
            if (t.equals("s")){
            System.out.println("El preu final del teu vol és: " + (100 + 50 - 50) + " Geo");
            } else if (t.equals("n")){
                System.out.println("El preu final del teu vol és: " + (100 + 50) + " Geo");
            }  
        
        } else if (continent == 4){
            System.out.println("Amèrica!");
            System.out.print("Tens targeta Prémium?(s/n) ");
            //System.out.println("1. Si");
            //System.out.println("2. No");
            //int t = input.nextInt();
            String t = input.next();
            if (t.equals("s")){
            System.out.println("El preu final del teu vol és: " + (100 + 50 - 50) + " Geo");
            } else if (t.equals("n")){
                System.out.println("El preu final del teu vol és: " + (100 + 50) + " Geo");
            }
            
        } else if (continent == 5){
            System.out.println("Europa!");
            System.out.print("Tens targeta Prémium?(s/n) ");
            //System.out.println("1. Si");
            //System.out.println("2. No");
            //int t = input.nextInt();
            String t = input.next();
            if (t.equals("s")){
            System.out.println("El preu final del teu vol és: " + (100 + 70 - 50) + " Geo");
            } else if (t.equals("n")){
                System.out.println("El preu final del teu vol és: " + (100 + 70) + " Geo");
            }  

    
    } else {
            System.out.println("Introdueix un nombre de continent vàlid");
        }
        }
    }

 
    
