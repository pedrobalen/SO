/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leitoresescritores;

/**
 *
 * @author laboratorio
 */

public class Main {
    public static void main(String[] args) {
        LeitoresEscritores monitor = new LeitoresEscritores();

        for (int i = 0; i < 3; i++) {
            new Leitor(monitor).start();
        }

        for (int i = 0; i < 2; i++) {
            new Escritor(monitor).start();
        }
    }
}
