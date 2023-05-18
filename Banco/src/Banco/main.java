package Banco;

public class main {
	 public static void main(String[] args) {
	        CuentaCorriente cuentaCorriente = new CuentaCorriente("ES1234567890", 1000);
	        CuentaAhorro cuentaAhorro = new CuentaAhorro("ES0987654321", 3100);
	        
	        
	        System.out.println("---Mostrar datos cuentas---");
	        System.out.println("Cuenta Corriente IBAN: " + cuentaCorriente.getIban() + " Saldo: " + cuentaCorriente.getSaldo());
	        System.out.println("Cuenta Ahorro IBAN: " + cuentaAhorro.getIban() + " Saldo: " + cuentaAhorro.getSaldo());
	        
	        System.out.println("---Hacer Ingresos, retiros y mostrarlos por pantallas---");
	        cuentaCorriente.ingresarDinero(1000);
	        cuentaAhorro.retirarDinero(500);
	        
	        System.out.println("Cuenta Corriente IBAN: " + cuentaCorriente.getIban() + " Saldo: " + cuentaCorriente.getSaldo());
	        System.out.println("Cuenta Ahorro IBAN: " + cuentaAhorro.getIban() + " Saldo: " + cuentaAhorro.getSaldo());

	        System.out.println("Anadir interes y mostrar");
	        cuentaCorriente.calcularIntereses();
	        cuentaAhorro.calcularIntereses();
	        
	        System.out.println("Cuenta Corriente IBAN: " + cuentaCorriente.getIban() + " Saldo: " + cuentaCorriente.getSaldo());
	        System.out.println("Cuenta Ahorro IBAN: " + cuentaAhorro.getIban() + " Saldo: " + cuentaAhorro.getSaldo());
	
	    }
}
