import java.util.Scanner;
public class Ejercicio42punto {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("ingrese el primer numero : ");
        int num1 = leer.nextInt();
        System.out.println(" ingrese el segundo numero :");
        int num2 = leer.nextInt();

         if (num1 > num2){
            System.out.println("el primer numero es el mayor ");
         } 
         if (num1 < num2) {
            System.out.println("el primer numero es el mas pequeño");
         }
         else{
             System.out.println("ambos numeros son iguales");
            }

         leer.close();

            }

    }

