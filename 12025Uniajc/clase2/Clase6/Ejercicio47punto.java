import java.util.Scanner;

public class Ejercicio47punto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso del alumno en kg: ");
        double peso = scanner.nextDouble();

        if (peso < 40) {
            System.out.println("El alumno pesa menos de 40 kg.");
        } else if (peso >= 40 && peso <= 50) {
            System.out.println("El alumno pesa entre 40 y 50 kg.");
        } else if (peso > 50 && peso < 60) {
            System.out.println("El alumno pesa más de 50 kg y menos de 60 kg.");
        } else {
            System.out.println("El alumno pesa 60 kg o más.");
        }
         scanner.close();
        }

    }
    

