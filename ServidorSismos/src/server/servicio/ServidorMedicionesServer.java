/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.servicio;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.negocio.GestorMediciones;

/**
 *
 * @author faber
 */
public class ServidorMedicionesServer extends UnicastRemoteObject implements InterfaceRemota{
    private final GestorMediciones gesMediciones;
   

    /**
     * Constructor
     */
    public ServidorMedicionesServer() throws RemoteException {
        super();
        gesMediciones = new GestorMediciones();
        
    }
   
    @Override
    public void agregarMedicion(String id, String promedio, String desviacion) throws RemoteException {
         
        try {
            gesMediciones.agregarMedicion(id, promedio, desviacion);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServidorMedicionesServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
    
}
