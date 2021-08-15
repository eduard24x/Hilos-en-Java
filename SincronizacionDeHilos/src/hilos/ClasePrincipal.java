package hilos;

/**
 *
 * @author Eduard
 */
public class ClasePrincipal {
      public static void main(String[] args) {//Método main
        
        Hilo1 hilo1 = new Hilo1();//Instancias para los cuatro hilos
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();
        
        //Hilo1
        hilo1.start();//Ejecutar hilo1
        try {
            hilo1.sleep(10);//Bloqueo del hilo1 por 10 milisegundos
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1 " + e);
        }
        
        //Hilo2
        hilo2.start();//Ejecutar hilo2
        try {
            hilo2.sleep(10);//Bloqueo del hilo2 por 10 milisegundos
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }
        
        //Hilo3
        hilo3.start();//Ejecutar hilo3
        try {
            hilo3.sleep(10);//Bloqueo del hilo3 por 10 milisegundos
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo3 " + e);
        }
        
        //Hilo4
        hilo4.start();//Ejecutar hilo4
        try {
            hilo4.sleep(10);//Bloqueo del hilo3 por 10 milisegundos
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo4 " + e);
        }
    }
}
