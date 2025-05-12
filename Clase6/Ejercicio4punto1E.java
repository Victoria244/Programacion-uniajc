import java.util.Scanner;

public class Ejercicio4punto1E {
    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

      int distancia = 0;
      int tiempo = 0;
    
      System.out.print("Usuario ingrese la distancia: ");
      distancia = leer.nextInt();


      if(distancia>20 && distancia<35){
        System.out.println("Usuario ingrese el tiempo: ");
        tiempo = leer.nextInt();
        System.out.println("El tiempo es: "+tiempo);
      }
      else{
        System.out.println("La distancia no esta dentro del rango");
      }

      leer.close();

    }
    
}

