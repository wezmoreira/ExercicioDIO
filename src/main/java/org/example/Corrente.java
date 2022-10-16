package org.example;

public class Corrente extends Conta{

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== extrato conta corrente ====");
        System.out.println(String.format("Agência: %s", super.cliente.getNome()));
        System.out.println(String.format("Agência: %d", super.agencia ));
        System.out.println(String.format("Numero: %d", super.numero ));
        System.out.println(String.format("Saldo: %.2f", super.saldo ));
        System.out.println("=================================");
        System.out.println();
    }
}
