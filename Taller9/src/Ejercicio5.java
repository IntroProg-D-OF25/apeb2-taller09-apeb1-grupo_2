
/**
 *
 * @author juand
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];

        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Sobresaliente";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Bueno";
            } else {
                promediosCualitativos[i] = "Regular";
            }

            System.out.printf("%s promedio: %.2f promedio cualitativo: %s%n", estudiantes[i], promedios[i], promediosCualitativos[i]);
        }
    }
    
}
