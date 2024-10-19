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
public class HouseLend  extends Bebida {

 
    public HouseLend(){
        descripcion = "HouseLend";
    }
    
    
    @Override
    public double precio() {
       return 18.00;
    }
    
}
