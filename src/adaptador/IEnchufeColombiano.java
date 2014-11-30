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
public interface IEnchufeColombiano {
    // Devuelve un array de enteros con un voltaje de unos 110V
    int[] Flujo110V();
 
    // Devuelve el numero de bornes del enchufe
    int getNumeroBornes(); 
    
    //devuelve la frecuancia
    int getFrecuencia();
}
