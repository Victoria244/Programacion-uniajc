package JuegodeAdivinanza;

import java.util.Scanner;

public class JuegoAdivinanza {
    private int numeroSecreto;

    // Constructor que define un número secreto fijo (puedes hacerlo aleatorio si se
    // desea)
    public JuegoAdivinanza() {
        this.numeroSecreto = 42; // Puedes cambiar esto por uno aleatorio si lo prefieres
    }

    // Método para jugar
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int intento;

        System.out.println("¡Adivina el número secreto!");

        do {
            System.out.print("Ingrese su intento: ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Felicitaciones! Adivinaste el número.");
            }

        } while (intento != numeroSecreto);

        scanner.close();
    }

    // Método principal
    public static void main(String[] args) {
        JuegoAdivinanza juego = new JuegoAdivinanza();
        juego.jugar();
    }
}
