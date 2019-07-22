/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicionsismo.negocio;

import Framework.AbstractApp;
import Framework.Disparador;
import Framework.LecturaPorEvento;
import appmedicionsismo.vista.GUIPrincipal;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Crist
 */
public class appMedicionSisimica extends AbstractApp{

    /**
     *
     */
    

   
    
    

    @Override
    public void crearSistemaMedicion() {
        
        
            
            FabricaSismografo sismografo = new FabricaSismografo();
            Disparador disparador = new Disparador(new LecturaPorEvento(), sismografo);
            GUIPrincipal frmSismico = new GUIPrincipal(disparador);
            sismografo.Settings(frmSismico.getEscala(), frmSismico.getAlarma());
            sismografo.crearItemMedicion();
            frmSismico.setVisible(true);
      
            
            
       
        
        
    }
    public static void main(String[] args){
        
      
            //FrameSismico frmSismico = new FrameSismico(disparador;
            //miFabrcia.Settings(frm.getEscala, frm.gerAlarma);
            //frmSismico.setVisible(true);
            //gesMedicion.agregarMedicion(id, pro, des);
            appMedicionSisimica Medicion = new appMedicionSisimica();
            Medicion.crearSistemaMedicion();
        
      
        
    }
   
         
    }
    

