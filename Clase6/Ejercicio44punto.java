import java.util.Scanner;

public class Ejercicio44punto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = entrada.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        } else {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        }

        entrada.close();
    }
}