import java.util.Scanner;

public class Ejercicio43punto1C {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = leer.nextInt();

        if ((numero1 < numero2 && numero1 > numero3) || (numero1 > numero2 && numero1 < numero3)) {
            System.out.println("El número central es: " + numero1);
        } else if ((numero2 < numero1 && numero2 > numero3) || (numero2 > numero1 && numero2 < numero3)) {
            System.out.println("El número central es: " + numero2);
        } else {
            System.out.println("El número central es: " + numero3);
        }

        leer.close();
    }

}
