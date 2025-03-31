import java.util.Scanner;

public class Ejercicio413punto {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Introduzca un mes (1 para Enero, 2 para Febrero,...): ");
        double mesDecimal = leer.nextDouble();
        int mes = (int) mesDecimal;

        System.out.print("Introduzca un día del mes: ");
        double diaDecimal = leer.nextDouble();
        int dia = (int) diaDecimal;

        if (mes < 1 || mes > 12) {
            System.out.println("Mes no válido");
        } else if (dia < 1 || dia > 31) {
            System.out.println("Día no válido");
        } else {
            switch (mes) {
                case 2: // Febrero
                    if (dia > 29) {
                        System.out.println("Día no válido para febrero");
                    }
                    break;
                case 4: // Abril
                case 6: // Junio
                case 9: // Septiembre
                case 11: // Noviembre
                    if (dia > 30) {
                        System.out.println("Día no válido para este mes");
                    }
                    break;
                default:
                    // El día es válido para otros meses
                    break;
            }
        }

        leer.close();
    }

}
