
package com.mycompany.concecionaria.persistencia;

import com.mycompany.concecionaria.logica.Autos;
import com.mycompany.concecionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladorPersistencia {
    AutosJpaController autosJpa = new AutosJpaController();

    public void guardarDatos(Autos auto) {
 
            autosJpa.create(auto);


    }

    public List<Autos> traerAutos() {

   return autosJpa.findAutosEntities();
    
    
    
    }

    public void eliminarAuto(int id_auto) {

        try {
            autosJpa.destroy(id_auto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }



    }

    public Autos traerAuto(int id_auto) {
        
     return   autosJpa.findAutos(id_auto);
    
    }

    public void modificarAuto(Autos auto) {
 
        try {
            autosJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

 
    
}
