import java.util.Scanner;

public class Ejercicio4punto1C {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double positivos = 20;
        double negativos = -10;
        double numero;
        System.out.print("Introduce un nuemro :");
        numero = leer.nextDouble();

        if (numero > 0) {
            System.out.println(" total de positivos" + positivos + numero);
        } else {
            System.out.println("total de negativos" + positivos + numero);

            leer.close();

        }

    }

}
