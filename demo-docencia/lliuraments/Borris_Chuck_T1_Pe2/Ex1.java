// Chuck Borris - M0485 Programació - T1
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Aigua 1.20€");
        System.out.println("2 - Refresc 2.50€");
        System.out.println("3 - Café 1.80€");
        System.out.println("4 - Sandwich 4.50€");
        System.out.println("5 - Barreta 1.50€");

        System.out.print("Selecciona producte: ");
        int codi = sc.nextInt();

        if (codi > 0 && codi < 5) {
            System.out.print("Quantitat: ");
            int quantitat = sc.nextInt();

            double pr;
            switch (codi) {
                case 1: pr = 1.20; break;
                case 2: pr = 2.50;
                case 3: pr = 1.80; break;
                case 4: pr = 4.50; break;
                case 5: pr = 1.50; break;
                default: pr = 0;
            }

            double total = pr * quantitat;
            System.out.println("Total: " + total + " €");
        } else {
            System.out.println("Producte no disponible.");
        }
    }
}
