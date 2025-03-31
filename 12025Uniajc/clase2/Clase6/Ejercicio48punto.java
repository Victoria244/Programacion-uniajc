import java.util.Scanner;

public class Ejercicio48punto {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();

        if (numero1 / numero2 == 0) {
            System.out.println(numero2 + " es divisor de " + numero1);
        } else if (numero2 % numero1 == 0) {
            System.out.println(numero1 + " es divisor de " + numero2);
        } else {
            System.out.println("Ninguno de los números es divisor del otro");
        }

        leer.close();
    }

    }

