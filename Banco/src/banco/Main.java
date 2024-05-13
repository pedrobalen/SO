/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author laboratorio
 */




public class Main {
    public static void main(String[] args) {
        Banco conta = new Banco(1000);

        Thread cliente1 = new Thread(new Cliente(conta));
        Thread cliente2 = new Thread(new Cliente(conta));

        cliente1.start();
        cliente2.start();
    }
}
