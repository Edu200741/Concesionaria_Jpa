
package com.mycompany.concecionaria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Autos implements Serializable {
 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id_auto;
    private String marca;
    private String modelo;
    private String patente;
    private String codicion;
    private int cantPuertas;

    public Autos() {
    }

    public Autos(int id_auto, String marca, String modelo, String patente, String codicion, int cantPuertas) {
        this.id_auto = id_auto;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.codicion = codicion;
        this.cantPuertas = cantPuertas;
    }

    public int getId_auto() {
        return id_auto;
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getCodicion() {
        return codicion;
    }

    public void setCodicion(String codicion) {
        this.codicion = codicion;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

   
    
    
    
    
}
