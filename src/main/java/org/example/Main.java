package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Wesley", "000.000.000", 25);
        Cliente cliente2 = new Cliente("Rodrigo", "000.000.000", 27);

        Conta cc = new Corrente(cliente);
        Conta poupanca = new Poupanca(cliente2);

        cc.depositar(100);
        poupanca.depositar(50);
        cc.transferir(20, poupanca);


        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
}