import java.util.Scanner;

import ContadorDigitosPares.ContadorDigitosPares;

    public class ContadorDigitosPares { private int numero;
 
// Constructor que recibe el número
public ContadorDigitosPares(int numero) {
    this.numero = numero;
}
 
// Método para contar los dígitos pares basado en el pseudocódigo
public int contarPares() {
    int contador = 0;
    int num = Math.abs(numero); // Asegura que sea positivo
    do {
        int digito = num % 10;
        if (digito % 2 == 0) {
            contador++;
        }
        num /= 10;
    } while (num != 0);
    
    return contador;
}
 
// Método principal para probar la clase
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero positivo: ");
    int numero = scanner.nextInt();
    
    ContadorDigitosPares objNumero1 = new ContadorDigitosPares(numero);
    int pares = objNumero1.contarPares();
    
    System.out.println("El número " + numero + " tiene " + pares + " dígitos pares.");
    
    scanner.close();
}
 
}