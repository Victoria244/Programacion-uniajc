import java.util.Scanner;

public class Ejercicio49punto {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el ángulo en grados: ");
        int angulo = leer.nextInt();

        if (angulo < 90) {
            System.out.println("Ángulo agudo");
        } else if (angulo > 90) {
            System.out.println("Ángulo obtuso");
        } else {
            System.out.println("Ángulo recto");
        }

        leer.close();
    }

    }

