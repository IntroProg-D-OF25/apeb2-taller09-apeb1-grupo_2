import java.util.Scanner;
/**
 *
 * @author juand
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el número de marcas a registrar: ");
        int numMarcas = tcl.nextInt();
        String[] marcas = new String[numMarcas];       
        int indice = 0;
        while (indice < numMarcas) {
            System.out.print("Ingrese la marca #" + (indice + 1) + ": ");
            String marca = tcl.next();
            if (!marca.startsWith("A") && !marca.startsWith("C") && !marca.startsWith("T")) {
                marcas[indice] = marca;
                indice++;
            } else {
                System.out.println("La marca no será registrada, inicia con A, C o T.");
            }
        }
        System.out.println("Marcas registradas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
}
