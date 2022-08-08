package com.company;

public class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;



    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor){
        saldo = saldo - valor;

        }
    public void depositar (double valor){
            saldo = saldo + valor;
        }

    public void transferir (double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        }

    @Override
    public void imprimirExtrato() {

    }


    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.print(String.format("Agencia: %d", this.agencia));
        System.out.print(String.format("numero: %d", this.numero));
        System.out.print(String.format("Saldo: %.2d", this.saldo));
    }


}
