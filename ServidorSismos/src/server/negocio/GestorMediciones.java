/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.negocio;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author faber
 */
public class GestorMediciones {

    private final ConectorJdbc conector;
    
    public GestorMediciones() {
       
        conector = new ConectorJdbc();
        
    }
    
    
   
    /**
     * agrega un sismo a la base de datos
     *
     * @param idEstacion
     * @param promedio
     * @param desviacion
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void agregarMedicion(String idEstacion, String promedio, String desviacion) throws ClassNotFoundException, SQLException {
        System.out.println("Entra agregar mediciones");
        conector.conectarse();
        conector.crearConsulta("INSERT INTO MEDICION VALUES ("
                    +"'"+idEstacion+"','"+promedio+"','"+desviacion+"')");
        conector.desconectarse();

    }
    
}
