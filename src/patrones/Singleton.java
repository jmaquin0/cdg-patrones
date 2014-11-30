/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones;

/**
 *
 * @author JuanManuel
 */
public class Singleton {
    private static Singleton INSTANCE = null;
 private  int valor;

    public  void setValor(int valor) {
        this.valor = valor;
    }

    public  int getValor() {
        return valor;
    }
    // Private constructor suppresses 
    private Singleton(){}
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Singleton();
            
        }
    }
 
    public static Singleton getInstance() {
        createInstance();
        return INSTANCE;
    }
}
