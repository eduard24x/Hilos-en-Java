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
public class ClasePrincipal {
    public static void main(String[] args) {
        
        Proceso hilo1 = new Proceso(" Hilo1");//Instanciación de los hilos
        Proceso hilo2 = new Proceso(" Hilo2");
        Proceso hilo3 = new Proceso(" Hilo3");
        
        hilo1.ValorDeLaCondicion(5);//Pasando un valor a los hilos como parámetros
        hilo2.ValorDeLaCondicion(10);
        hilo3.ValorDeLaCondicion(5);
        
        hilo1.start();//Arranque de los hilos
        hilo2.start();
        hilo3.start();
    }
}
