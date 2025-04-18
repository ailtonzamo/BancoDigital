package src.main.java.com.banco_digital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("José", "123.456.789-00");
        Cliente cliente2 = new Cliente("Ana", "987.654.321-00");

        Conta conta1 = new ContaCorrente("001", cliente1, 500.0);
        Conta conta2 = new ContaCorrente("002", cliente2, 300.0);

        conta1.depositar(1000);
        conta2.depositar(500);

        System.out.println("Antes da transferência:");
        System.out.println(conta1);
        System.out.println(conta2);

        // Transferindo R$ 200 de conta1 para conta2
        conta1.transferir(200, conta2);

        System.out.println("Após a transferência:");
        System.out.println(conta1);
        System.out.println(conta2);
    }
}

