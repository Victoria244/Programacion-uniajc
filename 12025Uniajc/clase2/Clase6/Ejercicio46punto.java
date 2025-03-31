
import java.util.Scanner;

public class Ejercicio46punto {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = leer.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = leer.nextInt();

        System.out.print("Ingrese el año: ");
        int año = leer.nextInt();

        int dias_mes;

        if (mes == 2) { // Febrero
            if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                dias_mes = 29; // Año bisiesto
            } else {
                dias_mes = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            dias_mes = 30;
        } else {
            dias_mes = 31;
        }

        dia = dia + 1;

        if (dia > dias_mes) {
            dia = 1;
            mes = mes + 1;

            if (mes > 12) {
                mes = 1;
                año = año + 1;
            }
        }

        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);

        leer.close();
    }
}
