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
public class Proceso1 extends Thread{ //Heredar de la clase Thread a través del JDK. 
     @Override
    public void run(){//Implementando método run
        for(int i = 0; i <= 5; i++){//Método for de 0 a 5 para imprimir Proceso 1
            System.out.println("Proceso 1");
        }
    }
}
