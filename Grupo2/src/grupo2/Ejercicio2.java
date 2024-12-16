/***
* Ejercicio 2
Escriba un programa que permita presentar la siguiente serie:
1/2, 1/3, 2/5, 3/7, 5/11, 8/13, . . . fibonaccis / primos 
*/
package grupo2;
public class Ejercicio2 {
    public static void main(String[] args) {
        int terms = 10; 
        int a = 1, b = 1; // Para Fibonacci
        int prime = 2;
        System.out.println("Serie generada:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + "/" + prime);
            if (i < terms - 1) {
                System.out.print(", ");
            }
            int temp = a;
            a = b;
            b = temp + b;
            prime++;
            while (true) {
                boolean esPrimo = true;
                for (int j = 2; j <= Math.sqrt(prime); j++) {
                    if (prime % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    break;
                }
                prime++;
            }
        }
    }
}
/**
 * Serie generada:
 * 1/2, 1/3, 2/5, 3/7, 5/11, 8/13, 13/17, 21/19, 34/23, 55/29
