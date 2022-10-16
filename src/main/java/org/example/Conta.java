package org.example;

public abstract class Conta implements IConta{
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO++;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
