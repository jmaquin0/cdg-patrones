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
public class pruebaDecorador {
    
    public static void main(String[]  args){
        Vehiculo miBus= new Bus();
        Vehiculo otroBus= new Gas(miBus);
        Vehiculo hibrido= new Gasolina(otroBus);
        mostrarCaracteristicas(miBus);
        mostrarCaracteristicas(otroBus);
        mostrarCaracteristicas(hibrido);
    }

    private static void mostrarCaracteristicas(Vehiculo elVeh) {
        System.out.println("descripción: " + elVeh.Descripcion() + " vel máx: " + elVeh.VelocidadMaxima() + "Consumo: " + elVeh.Consumo());
    }
    
}
