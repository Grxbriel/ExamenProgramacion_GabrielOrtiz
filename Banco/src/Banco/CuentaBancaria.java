package Banco;

public abstract class CuentaBancaria {
    protected String iban;
    protected Integer saldo;
    protected static final Integer interesBasicoAnual = (int) 0.05;

    public CuentaBancaria(String iban, Integer saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public void consultarAtributos() {
        System.out.println("IBAN: " + iban);
        System.out.println("Saldo: " + saldo);
    }

    public void ingresarDinero(Integer cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han ingresado " + cantidad + " euros.");
        } else {
            System.out.println("La cantidad ingresada debe ser positiva.");
        }
    }

    public void retirarDinero(Integer cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                System.out.println("Se han retirado " + cantidad + " euros.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    public void traspasarDinero(CuentaBancaria cuentaDestino, Integer cantidad) {
        if (cantidad > 0) {
            if (saldo >= cantidad) {
                saldo -= cantidad;
                cuentaDestino.saldo += cantidad;
                System.out.println("Se han traspasado " + cantidad + " euros a la cuenta con IBAN: " + cuentaDestino.iban);
            } else {
                System.out.println("Saldo insuficiente para realizar el traspaso.");
            }
        } else {
            System.out.println("La cantidad a traspasar debe ser positiva.");
        }
    }

    public abstract void calcularIntereses();
    

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}
}
