/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumne_12;
import java.util.Scanner;
/**
 *
 * @author alumne-12
 */
public class E2 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Quant pesa el teu producte (g): ");
    double g = input.nextDouble();
    
    System.out.println("1 - Tomaquet");
    System.out.println("2 - Ceba");
    System.out.println("3 - Pressecs");
    System.out.println("4 - Patates");
    System.out.println("5 - Pinya");
    System.out.print("Selecciona un producte: ");
    int a = input.nextInt();
    double b = g / 1000;
    double t = 2.7468;
    double c = 1.9846;
    double pre = 4.1234;
    double pat = 1.5474;
    double pi = 7.9985;
    
    switch (a){
        case 1:
            double preu = b * t; System.out.printf("%d Kg de tomaquet costen %.2f €",a ,preu);
            break;
        case 2:
            double preuc = b * c; System.out.printf("%d Kg de ceba costen %.2f €",a ,preuc);
            break;
        case 3:
            double preupre = b * pre; System.out.printf("%d Kg de pressec costen %.2f €",a ,preupre);
            break;
        case 4:
            double preupat = b * pat; System.out.printf("%d Kg de patata costen %.2f €",a ,preupat);
            break;                
        case 5:
            double preupi = b * pi; System.out.printf("%d Kg de pinya costen %.2f €",a ,preupi);
            break;
    }
    
}
}
