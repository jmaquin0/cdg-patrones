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
public class Gasolina extends Decorador{
    
     // Instancia de la clase vehiculo
    private Vehiculo elVehiculo;

    public Gasolina(Vehiculo unVehiculo) {
        this.elVehiculo = unVehiculo;
    }

    
    @Override
    public String Descripcion() {
        return elVehiculo.Descripcion()+" Gasolina";
    }

    @Override
    public int VelocidadMaxima() {
        return elVehiculo.VelocidadMaxima()+60;
    }

    @Override
    public double Consumo() {
        return elVehiculo.Consumo()+1.2;
    }
    
}
