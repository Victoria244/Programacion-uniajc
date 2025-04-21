public class Circulo {
   
    //Atributos
    private double radio;

    // Constructor de la clase: nos permite inicializar la clase
    // El mètodo constructor se llama igual que la clase 
    public Circulo(double radio){
        this.radio = radio; // this es una autoreferencia al atributo de la clase
    }
    
    //Metodos
    public double calcularPerimetro(){
        return  2* Math.PI * radio;
    }
    public double calcularArea(){
        return Math.PI * (radio * radio); //Math.PI * Math.pow(r,2)
    }
}