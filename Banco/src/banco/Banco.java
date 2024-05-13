/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author laboratorio
 */
class Banco {
    private int saldo;

    public Banco(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(int valor) {
        saldo += valor;
        System.out.println("Deposito de " + valor + " realizado. Saldo atual: " + saldo);
        notify(); 
    }

    public synchronized void sacar(int valor) {
        while (valor > saldo) {
            try {
                System.out.println("Saldo insuficiente para sacar " + valor + ". Aguardando deposito.");
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " Saldo atual: " + saldo);
    }
}