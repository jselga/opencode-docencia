package alumne_06;
import java.util.Scanner;
/**
 *
 * @author alumne-06
 */
public class exercici2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quants grams pesa el producte actual?: ");
        int grams = input.nextInt();
        
        double u = 2.7468;
        double d = 1.9846;
        double t = 4.1234;
        double q = 1.5474;
        double c = 7.9987;
        
        double total;
        double cen;
        
        System.out.println("""
        1 - Tomaquet
        2 - Ceba
        3 - Pressecs
        4 - Patates
        5 - Pinya
                           """);
        
        System.out.print("Selecciona un producte: ");
        int producte = input.nextInt();
        
        if (producte == 1) {
            cen = u / 10;
            total = u * cen;
            System.out.printf("%dgr de Tomaquet costen %.2f", grams, total);
        } else if (producte == 2) {
            cen = d / 10;
            total = d * cen;
            System.out.printf("%dgr de Ceba costen %.2f", grams, total);
        } else if (producte == 3) {
            cen = t / 10;
            total = t * cen;
            System.out.printf("%dgr de Pressecs costen %.2f", grams, total);
        } else if (producte == 4) {
            cen = q / 10;
            total = q * cen;
            System.out.printf("%dgr de Patates costen %.2f", grams, total);
        } else if (producte == 5) {
            cen = c / 10;
            total = c * cen;
            System.out.printf("%dgr de Pinya costen %.2f", grams, total);
        }
        
    }
}
