package ContadorDigitosPares;

public class EjecutarNumerosPares {
     public static void main(String[] args) {
        // Crear instancia de ContadorDigitosPares
        ContadorDigitosPares objNumero1 = new ContadorDigitosPares(2468);
        int pares = objNumero1.contarPares();
        System.out.println("El número 2468 tiene " + pares + " dígitos pares.");
        
        // Prueba con otro número
        ContadorDigitosPares objNumero2 = new ContadorDigitosPares(13579);
        pares = objNumero2.contarPares();
        System.out.println("El número 13579 tiene " + pares + " dígitos pares.");
        
        // Prueba con número de un solo dígito
        ContadorDigitosPares objNumero3 = new ContadorDigitosPares(0);
        pares = objNumero3.contarPares();
        System.out.println("El número 0 tiene " + pares + " dígitos pares.");
        
        // Prueba con un número negativo
        ContadorDigitosPares objNumero4 = new ContadorDigitosPares(-123456);
        pares = objNumero4.contarPares();
        System.out.println("El número -123456 tiene " + pares + " dígitos pares.");
    }

}
 

