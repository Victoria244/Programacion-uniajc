package Activida10;

public class circulo {
    public static void main(String[] args) {

        try {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = leer.nextDouble();

            if (radio <= 0) {
                System.out.println("Digite el valor del radio");
            } else {
                double longitud = 3.141592654;
                double area = h * (radio * radio);

                System.out.printf("La longitud de la circunferencia es: %.2f%n", longitud);
                System.out.printf("El área del círculo es: " + area + "mm^2");
            }
        } catch (Exception e) {
            System.out.println("");
        } finally {
            scanner.close();
        }
    }
}
    }
}
