import java.util.Scanner;

public class Ejercicio412punto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número real: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número real: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Ingrese el código de selección (1: suma, 2: multiplicación, 3: división): ");
        int codigoSeleccion = entrada.nextInt();

        double resultado;

        if (codigoSeleccion == 1) {
            resultado = numero1 + numero2;
            System.out.println("Resultado de la suma: " + resultado);
        } else if (codigoSeleccion == 2) {
            resultado = numero1 * numero2;
            System.out.println("Resultado de la multiplicación: " + resultado);
        } else if (codigoSeleccion == 3) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("Error: división por cero");
            }
        } else {
            System.out.println("Código de selección no válido");
        }

        entrada.close();

    }
}
