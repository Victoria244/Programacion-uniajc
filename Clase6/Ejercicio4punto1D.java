import java.util.Scanner;

public class Ejercicio4punto1D {
     public static void main(String[] args) { 
  Scanner leer = new Scanner(System.in);

    //Declaramos la variables
    int x = 0;
    int y = 0;
    int z = 0;
    int p = 0;


    System.out.print("Usuario ingrese el valor de x: ");
    x = leer.nextInt();

    System.out.print("Usuario ingrese el valor de y: ");
    y = leer.nextInt();

    System.out.print("Usuario ingrese el valor de z: ");
    z = leer.nextInt();

    if(x>y && z<20){
      System.out.print("El valor para P es: "+(x*y));
    }
    else{
        System.out.print("Condicion no cumplida: ");
    }

    leer.close();
    }
}


