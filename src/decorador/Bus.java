/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author JuanManuel
 */
public class Bus extends Vehiculo {

    public Bus() {
        this.descripcion="Bus";
    }
    
  

    @Override
    public String Descripcion() {
        return super.Descripcion(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   

    @Override
    public int VelocidadMaxima() {
         return 180;
    }

    @Override
    public double Consumo() {
         return 6.2;
    }
    
}
