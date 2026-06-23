// Nom Cognoms - M0485 Programació - T1
import java.util.Scanner;

public class Ex1Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Aigua (1.20€)");
        System.out.println("2 - Refresc (2.50€)");
        System.out.println("3 - Café (1.80€)");
        System.out.println("4 - Sandwich (4.50€)");
        System.out.println("5 - Barreta (1.50€)");

        System.out.print("Selecciona producte: ");
        int codi = sc.nextInt();

        if (codi >= 1 && codi <= 5) {
            System.out.print("Quantitat: ");
            int quantitat = sc.nextInt();

            double preuUnitari;
            switch (codi) {
                case 1: preuUnitari = 1.20; break;
                case 2: preuUnitari = 2.50; break;
                case 3: preuUnitari = 1.80; break;
                case 4: preuUnitari = 4.50; break;
                case 5: preuUnitari = 1.50; break;
                default: preuUnitari = 0;
            }

            double total = preuUnitari * quantitat;
            System.out.printf("Total: %.2f €%n", total);
        } else {
            System.out.println("Producte no disponible.");
        }
    }
}
