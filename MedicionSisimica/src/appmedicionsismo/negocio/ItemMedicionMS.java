/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicionsismo.negocio;

import Framework.ItemMedicion;

/**
 *
 * @author Crist
 */
public class ItemMedicionMS extends ItemMedicion {
    double valor;
    
    public ItemMedicionMS() {
    }
    
    @Override
    protected void hacerLeerSensor() {
        valor = this.miSensor.leer();
    }

    @Override
    protected void hacerAlmacenarResultado() {
        //Perroo aqui toca meter lo de la bd
        /**TODO*/
    }

    @Override
    protected boolean hacerCompararValores() {
        System.out.println(""+valor);
        return valor <= 7;
    }

    @Override
    protected void hacerEjecutarAcciones() {
        this.miActuador.actuar();
    }
    
}
