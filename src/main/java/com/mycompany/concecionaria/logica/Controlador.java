
package com.mycompany.concecionaria.logica;

import com.mycompany.concecionaria.persistencia.ControladorPersistencia;
import java.util.List;


public class Controlador {
    ControladorPersistencia controlPersi = new ControladorPersistencia();

    public void guardarDatos(String marca, String modelo, String patente, String condicion, int cantPuertas) {

        Autos auto = new Autos();
        auto.setCantPuertas(cantPuertas);
        auto.setCodicion(condicion);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        
        controlPersi.guardarDatos(auto);
    
    }

    public List<Autos> traerAutos() {
 
    return controlPersi.traerAutos();
    
    
    }

    public void eliminarAuto(int id_auto) {
 
        controlPersi.eliminarAuto(id_auto);



    }

    public Autos traerAutos(int id_auto) {
 
      return  controlPersi.traerAuto(id_auto);
        
    }

    public void modificarAutos(Autos auto, String marca, String modelo, String patente, String condicion, int cantPuertas) {
        
       auto.setMarca(marca);
       auto.setModelo(modelo);
       auto.setPatente(patente);
       auto.setCodicion(condicion);
       auto.setCantPuertas(cantPuertas);
       
       controlPersi.modificarAuto(auto);
    }
}





