/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

/**
 *
 * @author ajuar
 */
public abstract class Bebida {
    String descripcion = "Bebida desconcida";
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public abstract double precio();
    
}
