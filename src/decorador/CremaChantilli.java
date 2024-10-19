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
public class CremaChantilli extends Decorador{

    private Bebida bebida;
    
    
    public CremaChantilli(Bebida bebida){
        this.bebida = bebida;
    }
    
    
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Crema Chantilli";
    }

    @Override
    public double precio() {
      return bebida.precio() + 5.00;
    }
    
}
