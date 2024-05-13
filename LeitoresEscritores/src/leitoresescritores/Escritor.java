/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leitoresescritores;

/**
 *
 * @author laboratorio
 */
class Escritor extends Thread {
    private LeitoresEscritores monitor;

    public Escritor(LeitoresEscritores monitor) {
        this.monitor = monitor;
    }

    public void run() {
        try {
            while (true) {
                monitor.iniciarEscrita();
                System.out.println("Escritor " + this.getId() + " está escrevendo");
                Thread.sleep(2000); 
                monitor.finalizarEscrita();
                Thread.sleep(2000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}