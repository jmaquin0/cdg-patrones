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
public class Automovil extends Vehiculo {

    public Automovil() {
        this.descripcion="Automovil";
    }
    
  

    @Override
    public String Descripcion() {
        return super.Descripcion(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
   

    @Override
    public int VelocidadMaxima() {
         return 160;
    }

    @Override
    public double Consumo() {
         return 7.5;
    }
    
}
