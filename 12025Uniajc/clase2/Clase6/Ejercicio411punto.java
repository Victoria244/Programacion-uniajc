import java.util.Scanner;

public class Ejercicio411punto {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        String seleccionOp = entrada.next();

        double resultado;

        if(seleccionOp.equals("+")) {
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
        } else {
            if(seleccionOp.equals("*")){
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
            } else {               
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: división por cero");
                }
                
            }

        entrada.close();
    }

    }

