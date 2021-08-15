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
public class Proceso2 implements Runnable{ //Implementado interfaz Runnable
    @Override
    public void run() {//Método run
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 2");
        }
    }

}
