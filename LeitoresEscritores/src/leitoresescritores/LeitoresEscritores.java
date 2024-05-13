/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leitoresescritores;

/**
 *
 * @author laboratorio
 */
class LeitoresEscritores {
    private int leitoresAtivos = 0;
    private boolean escritorAtivo = false;

    public synchronized void iniciarLeitura() throws InterruptedException {
        while (escritorAtivo) {
            wait(); 
        }
        leitoresAtivos++;
    }

    public synchronized void finalizarLeitura() {
        leitoresAtivos--;
        if (leitoresAtivos == 0) {
            notify(); 
        }
    }

    public synchronized void iniciarEscrita() throws InterruptedException {
        while (leitoresAtivos > 0 || escritorAtivo) {
            wait(); 
        }
        escritorAtivo = true;
    }

    public synchronized void finalizarEscrita() {
        escritorAtivo = false;
        notifyAll(); 
    }
}