package Banco;

public class CuentaCorriente extends CuentaBancaria {
    public CuentaCorriente(String iban, Integer saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularIntereses() {
        Integer intereses;
        if (saldo >= 0) {
            intereses = (int) (saldo * interesBasicoAnual);
        } else {
            intereses = (int) (saldo * (interesBasicoAnual / 2));
        }
        saldo += intereses;
        System.out.println("Se han calculado los intereses y se ha actualizado el saldo.");
    }
}