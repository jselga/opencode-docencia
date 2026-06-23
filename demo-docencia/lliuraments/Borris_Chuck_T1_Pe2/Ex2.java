// Chuck Borris - M0485 Programació - T1
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingressos anuals: ");
        double in = sc.nextDouble();

        if (in <= 0) {
            System.out.println("Ingressos no vàlids.");
        } else {
            sc.nextLine();
            System.out.print("Ets autònom? (s/n): ");
            String res = sc.nextLine();
            boolean autonom = res == "s" || res == "S";

            double p;
            if (in < 12000) {
                if (autonom) { p = 5; } else { p = 0; }
            } else if (in <= 30000) {
                if (autonom) { p = 20; } else { p = 15; }
            } else if (in <= 60000) {
                if (autonom) { p = 30; } else { p = 25; }
            } else if (in > 60000) {
                if (autonom) { p = 40; } else { p = 35; }
            } else {
                p = 0;
            }

            double impost = in * p / 100;
            System.out.println("Impost: " + impost + " euros");
        }
    }
}
