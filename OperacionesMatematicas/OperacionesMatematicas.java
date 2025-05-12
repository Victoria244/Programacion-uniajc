package OperacionesMatematicas;

public class OperacionesMatematicas {
    
// Método para sumar dos números
public double sumar(double a, double b) {
    return a + b;
}

// Método para restar dos números
public double restar(double a, double b) {
    return a - b;
}

// Método para multiplicar dos números
public double multiplicar(double a, double b) {
    return a * b;
}

// Método para dividir dos números
public double dividir(double a, double b) {
    if (b == 0) {
        throw new ArithmeticException("No se puede dividir entre cero");
    }
    return a / b;
}

// Método para calcular la potencia (a^b)
public double potencia(double a, double b) {
    return Math.pow(a, b);
}

// Método para calcular la raíz cuadrada
public double raizCuadrada(double a) {
    if (a < 0) {
        throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
    }
    return Math.sqrt(a);
}

// Método para calcular el logaritmo natural
public double logaritmo(double a) {
    if (a <= 0) {
        throw new ArithmeticException("El logaritmo solo está definido para números positivos");
    }
    return Math.log(a);
}

// Método para calcular el seno
public double seno(double angulo) {
    return Math.sin(Math.toRadians(angulo));
}

// Método para calcular el coseno
public double coseno(double angulo) {
    return Math.cos(Math.toRadians(angulo));
}

// Método para calcular la tangente
public double tangente(double angulo) {
    return Math.tan(Math.toRadians(angulo));
}

public static void main(String[] args) {
    OperacionesMatematicas operaciones = new OperacionesMatematicas();
    System.out.println("Suma: " + operaciones.sumar(5, 3));
    System.out.println("Resta: " + operaciones.restar(8, 2));
    System.out.println("Multiplicación: " + operaciones.multiplicar(4, 7));
    System.out.println("División: " + operaciones.dividir(10, 2));
}
}
   