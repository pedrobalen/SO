/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author laboratorio
 */
class Cliente implements Runnable {
    private Banco conta;

    public Cliente(Banco conta) {
        this.conta = conta;
    }

    @Override
    public void run() {
        conta.depositar(100);
        conta.sacar(50);
        conta.sacar(80);
    }
}
