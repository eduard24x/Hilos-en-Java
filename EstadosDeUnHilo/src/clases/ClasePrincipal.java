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
        
        //PRIMER ESTADO DEL HILO
        Hilo_Proceso hilo1 = new Hilo_Proceso();//Instanciación del hilo 1
        Hilo_Proceso hilo2 = new Hilo_Proceso();//Instanciación del hilo 1
        
        //SEGUNDO ESTADO DEL HILO
        hilo1.start();//Estado del hilo 1 en start para iniciar
        
        //TERCER ESTADO DEL HILO
        try{//Sentencia para capturar excepciones
        hilo1.sleep(1000);//Dormir el hilo 1 con el método Sleep con el paso del parámetros en 1000 milisegundos
        }catch(InterruptedException e){
            System.out.println("Error en el hilo1 " + e);
        }
        
        hilo2.start();//Estado del hilo 2 en start para iniciar
        //CUARTO ESTADO
        hilo2.stop(); //Estado del hilo 2 en stop para su muerte (finalizar)
        
        try{
        hilo2.sleep(1000);//Dormir el hilo 2 con el método Sleep
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo 2 " + e);
        }
    }
}
