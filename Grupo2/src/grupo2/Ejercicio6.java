/***
 * Analice el siguiente código
 * Modifique el ciclo repetitivo para que salga del mismo, cuando el usuario ingrese por teclado una letra que 
 * coincida con la primera letra de los "nombres" contenidos en del arreglo estudiantes. 
 * Debe usar un ciclo repetitivo para recorrer el arreglo estudiantes, 
 * y no quemar de forma constante dichas iniciales, imagine que estudiantes podría contener millón de nombres, 
 * por lo que fijar iniciales, es ineficiente.
 */
package grupo2;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        while (true) {
            System.out.println("Ingrese una letra:");
            inicial = entrada.nextLine().toLowerCase();  
            for (String estudiante : estudiantes) {
                if (Character.toLowerCase(estudiante.charAt(0)) == inicial.charAt(0)) {  
                    System.out.println("¡Se encontró una coincidencia!");
                    entrada.close();
                    return;  
                }
            }
            System.out.println("No hay coincidencias. Intenta otra vez.");
        }
    }
}
/***
 * //////////////////////////////////////
Ingrese una letra:
z
No hay coincidencias. Intenta otra vez.
Ingrese una letra:
v
No hay coincidencias. Intenta otra vez.
Ingrese una letra:
l
�Se encontr� una coincidencia!
 *////////////////////////////////////////
