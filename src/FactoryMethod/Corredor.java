/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethod;

/**
 *
 * @author JuanManuel
 */
public class Corredor implements HacerAlgo 
{

    @Override
    public void hacerAlgo(String Verbo) {
        if (Verbo.equals("correr")){
        System.out.println("este objeto está corriendo");
        }
        else 
            System.out.println("el objeto está cansado");
    
    }
    
}
