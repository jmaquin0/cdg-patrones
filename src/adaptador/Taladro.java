/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

/**
 *
 * @author JuanManuel
 */
public class Taladro {
    private EnchufeColombiano miEnchufe;

    public Taladro(EnchufeColombiano elEnchufe) {
        this.miEnchufe = elEnchufe;
    }
    public void encender(){
        
        // Obtenemos la alimentación a través de la interfaz.
        // Recordemos que nuestro enchufe requiere una alimentacion de 110V
        int[] voltaje100ms = miEnchufe.Flujo110V();
        for (int i = 0; i < voltaje100ms.length; i++) {
            System.out.println("el taladro está funcionando a " + voltaje100ms[i] + " V");
            
        }
    }
    
}
