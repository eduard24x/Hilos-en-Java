/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Eduard
 */
public class Hilo_Proceso extends Thread {
    @Override
    public void run() {//Método Run
        for (int i = 0; i <= 5; i++) {//For para imprimir de 1 a 5 la variable i
            System.out.println(i + " " + getName());
            
            try{
            Hilo_Proceso.sleep(1000);//Dormir los hilos conforme se van creando
            }catch(InterruptedException e){
                System.out.println("Error dentro de la clase " + e);
            }
        }
    }
}
