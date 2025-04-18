package src.main.java.com.banco_digital;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, Cliente cliente, double limiteChequeEspecial) {
        super(numero, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente, mesmo considerando o cheque especial.");
        }
    }
}
