package SimuladorRelojArena;

import java.util.Scanner;

public class RelojArena {
    private int segundos;

    // Constructor
    public RelojArena(int segundos) {
        this.segundos = segundos;
    }

    // Método que realiza la cuenta regresiva
    public void contar() {
        int mitad = segundos / 2;

        while (segundos >= 0) {
            System.out.println(segundos);

            if (segundos == mitad) {
                System.out.println("¡Mitad del tiempo alcanzada!");
            }

            segundos--;
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los segundos para la cuenta regresiva: ");
        int segundos = scanner.nextInt();

        RelojArena reloj = new RelojArena(segundos);
        reloj.contar();

        scanner.close();
    }
}


