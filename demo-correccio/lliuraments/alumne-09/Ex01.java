package alumne_09;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author alumne-09
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcio, preuBase, preuFinal, descompteClient;
        float client;
        
        Scanner teclat = new Scanner(System.in);
        
        preuBase = 100;
        descompteClient = 50;
                    
        
        System.out.println("1 - Àfrica");
        System.out.println("2- Àsia");
        System.out.println("3- Oceania");
        System.out.println("4- Amèrica");
        System.out.println("5- Europa");
        
        opcio = teclat.nextInt();
        
        if (opcio == 1) {
            System.out.println("Tens una targeta Prèmium? Si 1, No 0");
            client = teclat.nextFloat();
            } else if (client == 1) { 
                System.out.println(preuBase + 10 - descompteClient);
            } else { 
                System.out.println(preuBase + 10);
            
                
        if (opcio == 2) {
            System.out.println("Tens una targeta Prèmium? Si 1, No 0");
            client = teclat.nextFloat();   
            } else if (client == 1) { 
                System.out.println(preuBase + 30 - descompteClient);
            } else { 
                System.out.println(preuBase + 30);

                
        if (opcio == 3) {
            System.out.println("Tens una targeta Prèmium? Si 1, No 0");
            client = teclat.nextFloat(); 
            } else if (client == 1) { 
                System.out.println(preuBase + 50 - descompteClient);
            } else { 
                System.out.println(preuBase + 50);
            
            
        if (opcio == 4) {
            System.out.println("Tens una targeta Prèmium? Si 1, No 0");
            client = teclat.nextFloat();  
            } else if (client == 1) { 
                System.out.println(preuBase + 50 - descompteClient);
            } else { 
                System.out.println(preuBase + 50);

                        
        if (opcio == 5) {
            System.out.println("Tens una targeta Prèmium? Si 1, No 0");
            client = teclat.nextFloat();
            } else if (client == 1) { 
                System.out.println(preuBase + 70 - descompteClient);
            } else { 
                System.out.println(preuBase + 70);
                
                

       
        }
    }
        
    
}
