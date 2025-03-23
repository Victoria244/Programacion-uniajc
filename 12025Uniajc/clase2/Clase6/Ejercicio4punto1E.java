       import java.util.Scanner;
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la distancia: ");
        int distancia = leer.nextInt();

        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingrese el tiempo: ");
            int tiempo = leer.nextInt();
            System.out.println("El tiempo ingresado es: " + tiempo);
        } else {
            System.out.println("La distancia no está dentro del rango especificado.");
        }

        leer.close();
  
}

