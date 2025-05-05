public class EjecutarCajeroElectronico {
    public static void main(String[] args) {
        // Crear el onjeto para trabajar con los metodos del cajero Electronico
        // Se crea el objeto objP1 con saldo inicial 1000
        CajeroEletronico obP1 = new EjecutarCajeroElectronico(1000.0);

        //Escenario 1
        //Depositar 1300 dolares
        System.out.println("Nuevo Saldo:" + objP1.depositar(1300.0));

        //Consultar saldo actual
        System.out.println("Saldo Actual: " + objP1.consultarSaldo());

        //Retirar una cantidad de 2000.0
        objP1.retirar(cantidad: 2000.0);

        //Transferir 200 a Medelin
        objP1.transferir(cantidad:2000.0,destino: "Medelin");
    }
}
