// Nom Cognoms - M0485 Programació - T1
import java.util.Scanner;

public class Ex2Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingressos anuals: ");
        double ingressos = sc.nextDouble();

        if (ingressos < 0) {
            System.out.println("Ingressos no vàlids.");
        } else {
            sc.nextLine();
            System.out.print("Ets autònom? (s/n): ");
            String resposta = sc.nextLine();
            boolean esAutonom = resposta.equals("s") || resposta.equals("S");

            double percentatge;
            if (ingressos <= 12000) {
                if (esAutonom) {
                    percentatge = 5;
                } else {
                    percentatge = 0;
                }
            } else if (ingressos <= 30000) {
                if (esAutonom) {
                    percentatge = 20;
                } else {
                    percentatge = 15;
                }
            } else if (ingressos <= 60000) {
                if (esAutonom) {
                    percentatge = 30;
                } else {
                    percentatge = 25;
                }
            } else {
                if (esAutonom) {
                    percentatge = 40;
                } else {
                    percentatge = 35;
                }
            }

            double impost = ingressos * percentatge / 100;
            System.out.printf("L'impost a pagar és: %.2f €%n", impost);
        }
    }
}
