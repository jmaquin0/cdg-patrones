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
public class pruebataladro {
    
    
    public static void main(String[] args){
    EnchufeColombiano unEnchufe = new EnchufeColombiano();
    EnchufeArgentino otroEnchufe = new EnchufeArgentino();
    EnchufeColombiano adaptador= new EnchufeColomboArgentino(otroEnchufe);
    Taladro elTaladro= new Taladro(adaptador);
    elTaladro.encender();
    }
    
    
}
