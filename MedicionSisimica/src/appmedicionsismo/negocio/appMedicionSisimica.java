/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicionsismo.negocio;

import Framework.AbstractApp;
import Framework.Disparador;
import Framework.LecturaPorEvento;
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
    public static  GestorMedicion gesMedicion = new GestorMedicion(); ;

    public appMedicionSisimica() throws RemoteException, ParseException{
        
    }
    
    

    @Override
    public void crearSistemaMedicion() {
        
        
            
            FabricaSismografo miFabrcia = new FabricaSismografo();
            Disparador disparador = new Disparador(new LecturaPorEvento(), miFabrcia);
      
            
            
       
        
        
    }
    public static void main(String[] args){
        
        try {
            String id = "1062";
            String pro = "10";
            String des = "20";
            //FrameSismico frmSismico = new FrameSismico(disparador;
            //miFabrcia.Settings(frm.getEscala, frm.gerAlarma);
            //frmSismico.setVisible(true);
            gesMedicion.agregarMedicion(id, pro, des);
        } catch (RemoteException ex) {
            Logger.getLogger(appMedicionSisimica.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
    }
   
         
    }
    

