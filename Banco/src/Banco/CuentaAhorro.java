package Banco;

public class CuentaAhorro extends CuentaBancaria {
    private static final double saldoMinimo = 1000;

    public CuentaAhorro(String iban, Integer saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        Integer intereses;
        if (saldo >= saldoMinimo) {
            intereses = (int) (saldo * (interesBasicoAnual * 2));
        } else {
            intereses = (int) (saldo * (interesBasicoAnual / 2));
        }
        saldo += intereses;
        System.out.println("Se han calculado los intereses y se ha actualizado el saldo.");
    }
}