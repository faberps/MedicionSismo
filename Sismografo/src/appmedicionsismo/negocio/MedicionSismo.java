/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicionsismo.negocio;

import Framework.ItemMedicion;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HECTOR
 */
public class MedicionSismo extends ItemMedicion
{
    //Atributos
    private Estacion est;
    public double atrValor;
     public final  GestorMedicion gesMedicion ;
    
    // metodo constructor por defecto
    public MedicionSismo()
    {
        est = new Estacion();
        gesMedicion = new GestorMedicion();
    }

    @Override
    protected void hacerLeerSensor() 
    {
        this.atrValor = this.miSensor.leer();
    }

    @Override
    protected void hacerAlmacenarResultado() 
    {
        
        try {
            String idEstacion = Integer.toString(est.getIdEstacion());
            String promedio = Double.toString(est.getPromedio());
            String desviacion = Double.toString(est.getDesviacion());
            gesMedicion.agregarMedicion(idEstacion,promedio, desviacion);
        } catch (RemoteException ex) {
            Logger.getLogger(MedicionSismo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected boolean hacerCompararValores()
    {
        System.out.println(""+this.atrValor);
        return (this.atrValor>7);
    }

    @Override
    protected void hacerEjecutarAcciones() {
        this.miActuador.actuar();
    }
    
}
