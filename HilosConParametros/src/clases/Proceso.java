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
public class Proceso extends Thread{//Herencia de la clase Thread
    int num_int;
    
    public Proceso(String NombreHilo){ //Método consstructor 
        super(NombreHilo);     
    }
    
    @Override
    public void run(){//Método Run
        for(int i = 0; i <= num_int; i++){
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }
    
    public void ValorDeLaCondicion(int valor){
        this.num_int = valor;
    }
}
