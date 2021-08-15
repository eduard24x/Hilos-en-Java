/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author Eduard
 */
public class Hilo1 extends Thread{//Heredar de la clase Thread
    @Override
    public void run() {//Método run
        for (int i = 0; i <= 5; i++) {//Ciclo for para imprimir de 0 a 5 la variable i seguido de la letra G
            System.out.print(i + ": G");

            try {
                Hilo1.sleep(1000);//Dormir el proceso del hilo1 durante 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo1 " + e);
            }
        }
    }
}
