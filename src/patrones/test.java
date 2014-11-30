/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JuanManuel
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Singleton uno= new Singleton(); //no es posible hacer esto pues el constructor es privado
      /*  Singleton dos = Singleton.getInstance();
        dos.setValor(8);
        Singleton tres = Singleton.getInstance();
        System.out.println(tres.getValor());
        dos.setValor(tres.getValor()*2);
         System.out.println(dos.toString());
          System.out.println(tres.toString());
        */
        List numeros= new LinkedList();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        numeros.add(8);
        
        while (numeros.listIterator().hasNext()){
            System.out.println(numeros.listIterator().next());
            numeros.remove(numeros.listIterator().next());
        }
        
    }
    
}
