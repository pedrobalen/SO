/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leitoresescritores;

/**
 *
 * @author laboratorio
 */
class Leitor extends Thread {
    private LeitoresEscritores monitor;

    public Leitor(LeitoresEscritores monitor) {
        this.monitor = monitor;
    }

    public void run() {
        try {
            while (true) {
                monitor.iniciarLeitura();
                System.out.println("Leitor " + this.getId() + " está lendo");
                Thread.sleep(1000); 
                monitor.finalizarLeitura();
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}