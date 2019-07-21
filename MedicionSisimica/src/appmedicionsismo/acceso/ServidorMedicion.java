/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicionsismo.acceso;

import java.rmi.RemoteException;

/**
 *
 * @author faber
 */
public interface ServidorMedicion {
 
    public void agregarMedicion(String idEstacion,String promedio, String desviacion) throws RemoteException;
    
}
