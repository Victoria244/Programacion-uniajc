import java.util.Scanner;

public class Ejercicio410punto {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica (0-100): ");
        int calificacion = entrada.nextInt();

        String letra;

        if (calificacion >= 90) {
            letra = "A";
        } else if (calificacion >= 80) {
            letra = "B";
        } else if (calificacion >= 70) {
            letra = "C";
        } else if (calificacion >= 60) {
            letra = "D";
        } else {
            letra = "F";
        }

        System.out.println("La calificación en letra es: " + letra);

        entrada.close();
    }
}
