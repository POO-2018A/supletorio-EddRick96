/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supleproductos;

/**
 *
 * @author ESFOT
 */
public class Componente extends SupleProductos{
    
    private String tipo;
    private int capacidad;
    private int velocidad;
    
    public Componente(String nombre, double precio, String marca, String categoria) {
        super(nombre, precio, marca, categoria);
    }

    public Componente(String nombre, double precio, String marca, String categoria, String tipo, int capacidad, int velocidad) {
        super(nombre, precio, marca, categoria);
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Componente\t" + "T: " + this.tipo + "\tCap.: " + this.capacidad + "\tVel.: " + this.velocidad;
    }
    
    
}
