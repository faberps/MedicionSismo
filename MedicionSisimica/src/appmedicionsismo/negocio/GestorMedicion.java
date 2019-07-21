/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedicionsismo.negocio;

import appmedicionsismo.acceso.ServidorMedicion;
import appmedicionsismo.acceso.ServidorMedicionSocket;
import appmedicionsismo.acceso.ServidorRMI;
import com.google.gson.Gson;
import java.rmi.RemoteException;
/**
 *
 * @author faber
 */
public class GestorMedicion {
    private final ServidorMedicion server;

    public GestorMedicion() {
        server =  new ServidorRMI();
    }
    
    /*
     public static MedicionSismo[] deserializarMediciones(String arrayJsonSerializado) {
 
        MedicionSismo mediciones[] = new Gson().fromJson(arrayJsonSerializado, MedicionSismo[].class);
        return mediciones;
    }
     */
     public void agregarMedicion(String id, String promedio, String desviacion) throws RemoteException{
         server.agregarMedicion(id, promedio, desviacion);
     }
    
    
}
