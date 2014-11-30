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
public interface IEnchufeArgentino {
     // Devuelve un array de enteros con un voltaje de unos 220V
    int[] Flujo220V();
 
    // Devuelve el numero de bornes del enchufe
    int getNumeroBornes();
     //devuelve la frecuancia
    int getFrecuencia();
}
