import java.util.Scanner;
/**
 *
 * @author juand
 */
public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el límite: ");
        int limite = tcl.nextInt();

        // Figura 1
        System.out.println("Figura 1:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Figura 2
        System.out.println("\nFigura 2:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Figura 3
        System.out.println("\nFigura 3:");
        for (int i = 1; i <= limite; i++) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = limite - 1; i >= 1; i--) {
            for (int j = 1; j <= limite - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
