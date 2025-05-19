import java.util.Scanner;

public class VerificadorPrimos {
    private int inicio;
    private int fin;

    // Constructor
    public VerificadorPrimos(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    // Método que cuenta cuántos primos hay en el rango
    public int contarPrimos() {
        int contador = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    // Método auxiliar para verificar si un número es primo
    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de inicio del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        int fin = scanner.nextInt();

        VerificadorPrimos obj = new VerificadorPrimos(inicio, fin);
        int cantidad = obj.contarPrimos();

        System.out.println("Entre " + inicio + " y " + fin + " hay " + cantidad + " números primos.");

        scanner.close();
    }
}
