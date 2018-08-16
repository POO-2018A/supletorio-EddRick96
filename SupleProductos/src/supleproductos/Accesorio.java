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
public class Accesorio extends SupleProductos{
    
    private String tipo;
    private String color;
    
    public Accesorio(String nombre, double precio, String marca, String categoria) {
        super(nombre, precio, marca, categoria);
    }

    public Accesorio(String tipo, String color, String nombre, double precio, String marca, String categoria) {
        super(nombre, precio, marca, categoria);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
