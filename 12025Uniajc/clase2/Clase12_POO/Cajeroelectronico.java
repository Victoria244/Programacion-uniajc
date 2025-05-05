public class Cajeroelectronico {

    // Atributos
    private double saldo;

    // Constructor
    public Cajeroelectronico(double saldo) {
        this.saldo = saldo;
    }

    // Metodos
    /*
     * Obtiene lo que tenga asignado el atributo saldo
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /*
     * Metodo para dpositar dinero y asignarselo al saldo
     * 
     * @param cantidad de tipo double
     * 
     * @return saldo
     */
    public double depositar(double cantidad) {
        return saldo += cantidad;

    }

    public double retirar(double cantidad) {
        if (cantidad <= saldo) {
            System.out.println("El nuevo saldo es:" + saldo)
         }else{
            System.out.println("La cantdidad a retirar es mayor que el saldo");
         } ;

        }
        /*
         * Obtener el saldo actual dela cuenta 
         * @return saldo
         */
        public double cosultarsaldo(){
            return saldo;
        }
        public void transferir( double cantidad, string destino){
            if(la cantidad <= saldo){
                System.out.println("Se realizo una transferencia por:" + cantidad + "a" + destino + "y su salso es: " + saldo);
            }else{
                System.out.println("La transferencia no se pudo hacer");
            }
        }
    }

