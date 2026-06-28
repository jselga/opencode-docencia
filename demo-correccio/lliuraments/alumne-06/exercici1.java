package alumne_06;
import java.util.Scanner;
/**
 *
 * @author alumne-06
 */

// El codi va molt mal, no se perque pero no registra be les coses i no fa molt cas el codi, he perdut molt temps en aquesta activitat
public class exercici1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("""
        1 - Àfrica
        2 - Àsia
        3 - Oceania
        4 - Amèrica
        5 - Europa                   
                           """);
        
        int PreuBase = 100;
        double total;
        
        String Rs = "";
        
        int africa = 10, asia = 30, oceania = 50, america = 50, europa = 70;
        
        System.out.print("Selecciona continent: ");
        int continent = input.nextInt();
        
        System.out.print("Tens una targeta Prèmium?(s/n): ");
        String premium = input.next(); 
        
        Rs += continent;
        Rs += premium;
        
        if (Rs == "1s") {
            total = PreuBase - 50 + africa;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "2s") {
            total = PreuBase - 50 + asia;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "3s") {
            total = PreuBase - 50 + oceania;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "4s") {
            total = PreuBase - 50 + america;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "5s") {
            total = PreuBase - 50 + europa;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } 

        if (Rs == "1n") {
            total = PreuBase - 50 + africa;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "2n") {
            total = PreuBase - 50 + asia;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "3n") {
            total = PreuBase - 50 + oceania;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "4n") {
            total = PreuBase - 50 + america;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } else if (Rs == "5n") {
            total = PreuBase - 50 + europa;
            System.out.printf("El teu vol costa %.2f Geo%n", total);
        } 

    }
    
}
