public class EjecutarCiculo {
    public static void main(String[] args) {
        double r = 2.3; // radio

        // Creacion del objeto
        Circulo objCirculo1 = new Circulo(r);

        // llamado a los metodos de la clase
        System.out.println("Perimetro: " + objCirculo1.calcularPerimetro());

        System.out.println("Area :" + objCirculo1.calcularArea());
    }
}