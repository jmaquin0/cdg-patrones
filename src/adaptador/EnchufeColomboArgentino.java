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
public class EnchufeColomboArgentino extends EnchufeColombiano{
    private EnchufeArgentino elArgentino;

    public EnchufeColomboArgentino(EnchufeArgentino enchufeArg) {
        this.elArgentino = enchufeArg;
    }
    

    @Override
    public int[] Flujo110V() {
            int[] respuesta = new int[100];
            for (int i = 0; i < respuesta.length; i++) {
            respuesta[i] = elArgentino.Flujo220V()[i]/2;
            
        }
            return respuesta;
    }

    @Override
    public int getNumeroBornes() {
        return elArgentino.getNumeroBornes();
    }

    @Override
    public int getFrecuencia() {
        return elArgentino.getFrecuencia()+10;
    }
    
}
