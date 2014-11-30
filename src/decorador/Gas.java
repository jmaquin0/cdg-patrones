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
public class Gas extends Decorador{
    
     // Instancia de la clase vehiculo
    private Vehiculo elVehiculo;

    public Gas(Vehiculo unVehiculo) {
        this.elVehiculo = unVehiculo;
    }

    
    @Override
    public String Descripcion() {
        return elVehiculo.Descripcion()+" Gas";
    }

    @Override
    public int VelocidadMaxima() {
        return elVehiculo.VelocidadMaxima()-25;
    }

    @Override
    public double Consumo() {
        return elVehiculo.Consumo()- 2.5;
    }
    
}
