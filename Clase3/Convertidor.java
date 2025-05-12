package Clase3;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        
        // Declaracion de las variables para el ejercicio
        // C -> grados Celcius, + -> grados Farenheit
        // Gradoscelcius, gradosfarenheit
        double c, f, Gradoscelcius, gradosfarenheit;

        // Pedir datos por teclado
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite los Celcius");
        c = leer.nextInt();
        System.out.println("Digite los grados Farenheit");
        f = leer.nextInt();
        leer.close();
        Gradoscelcius= (f - 32) * (5.0 / 9.0);
        gradosfarenheit = c * (9/5) + 32;

        // Mostrar los resultados de las formulas 
        System.out.println( "°F -> °C :" +  Gradoscelcius);
        System.out.println("°C -> °F :"+ gradosfarenheit);
        leer.close();

    }
    
}
