import java.util.Scanner;

public class Ejercicio4punto1C {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        double positivos = 20; 
        double negativos = -10;
        double numero = 0;

        //Mensaje de peticion de ingreso de numero del usuario
        System.out.print("Introduce un numero :");
        numero = leer.nextDouble();

        if (numero > 0){
            System.out.println(" total de positivos: " + positivos + numero);
        }else{
            System.out.println("total de negativos: " + negativos + numero);

            leer.close();
            

        }




    }
    
}