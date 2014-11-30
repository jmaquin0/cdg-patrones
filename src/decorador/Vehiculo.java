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
public abstract class Vehiculo {
    // Atributo común a todos los objetos que heredarán de esta clase
    protected String descripcion = "Vehículo genérico";
 
    // Método no abstracto que devolverá el contenido de la descripción
    // Se declara como virtual para que pueda sustituirse en las clases derivadas
    public String Descripcion()
    {
        return descripcion;
    }
 
    // Métodos abstractos
    public abstract int VelocidadMaxima();
    public abstract double Consumo();
}
