import java.util.Scanner;

public class Fabricadechocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de barras producidas en el dia: ");
        double n = scanner.nextInt();

        double costoProduccion = 2.50;
        double costoEmpaque = 0.50;
        
        double costoBarra = costoProduccion + costoEmpaque;
        double costoTotal = n * costoBarra;
        double precioVenta = costoBarra * 1.30;
        double ingresoTotal = n * precioVenta;

        double cajasCompletas = n / 10; 
        double barrasSueltas = n % 10; 

        System.out.println("    Resultados    ");
        System.out.printf("Costo total de produccion: $%.2f%n" , costoTotal);
        System.out.printf("Precio de venta por barra: $%.2f%n", precioVenta);
        System.out.printf("Ingreso total del dia: $%.2f%n", ingresoTotal);
        System.out.println("Cajas completas: " +cajasCompletas + " Barras sobrantes: " + barrasSueltas);

        scanner.close();
        
       
    }
}

        
