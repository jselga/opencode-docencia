/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne_02;
import java.util.Scanner;
/**
 *
 * @author alumne_02
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    
    // 01
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("1 - Africa");
        System.out.println("2 - Asia");
        System.out.println("3 - Oceania");
        System.out.println("4 - America");
        System.out.println("5 - Europa");
        System.out.print("continent de destinació: ");
    int a = input.nextInt();
        System.out.println("Tens premium? (s/n)");
    char p = input.next().charAt(0);    
    int base = 100;
    int pre = 50;
    if(a == 1 && p == 's'){int preu = base - pre + 10; 
        System.out.println("El preu sera de: " + preu + " Geo");
    }else if (a == 1){ int preua = base + 10;
        System.out.println("El preu sera de: " + preua + " Geo");}
    
    if(a == 2 && p == 's'){int preu = base - pre + 30; 
        System.out.println("El preu sera de: " + preu + " Geo");
    }else if (a == 2){ int preuas = base + 30;
        System.out.println("El preu sera de: " + preuas + " Geo");}
    
    if(a == 3 && p == 's'){int preu = base - pre + 50; 
        System.out.println("El preu sera de: " + preu + " Geo");
    }else if (a== 3){ int preuo = base + 50;
        System.out.println("El preu sera de: " + preuo + " Geo");}
    
    if(a == 4 && p == 's'){int preu = base - pre + 50; 
        System.out.println("El preu sera de: " + preu + " Geo");
    }else if (a == 4){ int preuam = base + 50;
        System.out.println("El preu sera de: " + preuam + " Geo");}
        
    if(a == 5 && p == 's'){int preu = base - pre + 70; 
        System.out.println("El preu sera de: " + preu + " Geo");
    }else if (a == 5){ int preue = base + 70;
        System.out.println("El preu sera de: " + preue + " Geo");}
    
}
}
