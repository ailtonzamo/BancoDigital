package src.main.java.com.banco_digital;

public abstract class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso para " + destino.cliente.getNome());
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }



    @Override
    public String toString() {
        return "Conta " + numero + " - Cliente: " + cliente.getNome() + " - Saldo: R$ " + saldo;
    }
}

