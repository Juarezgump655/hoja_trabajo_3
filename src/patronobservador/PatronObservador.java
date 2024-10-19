/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador;

import observadores.EstacionClimna;
import observadores.Insivumeh;
import observadores.SmartPhone;

/**
 *
 * @author ajuar
 */
public class PatronObservador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        EstacionClimna estacionClimna = new EstacionClimna();
        SmartPhone smartPhone = new SmartPhone(estacionClimna);
        estacionClimna.setMediciones(60, 42, 23);
        Insivumeh insivumeh = new Insivumeh(estacionClimna);
        estacionClimna.setMediciones(22, 65, 18);
    }

}
