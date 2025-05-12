import java.util.Scanner;

public class Ejercicio414punto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PISO_MIN = 1;
        final int PISO_MAX = 25;
        int pisoActual = 1;

        while (true) {
            System.out.println("Piso actual: " + pisoActual);
            System.out.println("Seleccione una opción:");
            if (pisoActual > PISO_MIN) {
                System.out.println("1: BAJAR");
            }
            if (pisoActual < PISO_MAX) {
                System.out.println("2: SUBIR");
            }
            System.out.println("3: SALIR");

            int opcion = scanner.nextInt();

            if (opcion == 1 && pisoActual > PISO_MIN) {
                pisoActual--;
            } else if (opcion == 2 && pisoActual < PISO_MAX) {
                pisoActual++;
            } else if (opcion == 3) {
                System.out.println("Saliendo del ascensor.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}