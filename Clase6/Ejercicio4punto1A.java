import java.util.Scanner;

public class Ejercicio4punto1A {
    public static void main(String[] args) {
        // Clase que permite a atraves del objeto "leer" solicitar
        // Datos por teclado
        Scanner leer = new Scanner(System.in);

        // Se declaran las variables o las varibles
        double angulo;

        // Solicitar por teclado el angulo para su validacion
        System.out.print("Digite el angulo:");
        angulo = leer.nextInt();

        // Condicional
        if (angulo == 90) {
            System.out.println("El angulo es un angulo recto");
        } else {
            System.out.println("EL angulo NO es un angulo recto");

        }
        leer.close();

    }
}
