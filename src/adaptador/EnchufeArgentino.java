/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptador;

import java.util.Random;

/**
 *
 * @author JuanManuel
 */
public class EnchufeArgentino implements IEnchufeArgentino{

    @Override
    public int[] Flujo220V() {
         int[] arrayFlujo = new int[100];
        Random r = new Random();
        for (int i = 0; i < arrayFlujo.length; i++)
        {
            // Calculamos la fluctuacion del voltaje
            int fluctuacion = r.nextInt(100)> 50 ? 1 : -1;    // Positiva o negativa
            fluctuacion = fluctuacion * (r.nextInt(10) + 1);    // El valor fluctuara entre -0 y +10
 
            // Valor total entre 210 y 230V
            arrayFlujo[i] = fluctuacion + 220;
        }
 
        return arrayFlujo;
    }

    @Override
    public int getNumeroBornes() {
        return 3;
    }

    @Override
    public int getFrecuencia() {
        return 50;
    }
    
}
