/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orden_reparacion;

import equipo.Equipo;
import servicios.Servicio;

/**
 *
 * @author USER
 */
public class OrdenReparacion {
    //Atr
    private String numero_Orden;
    private Equipo equipo;
    private Servicio servicio;
    private String observaciones;
    
    //Met get
    public String getNumero_Orden() {
        return numero_Orden;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public Servicio getServicio() {
        return servicio;
    }
    public String getObservaciones() {
        return observaciones;
    }
    
    //Met set
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    //Constructor
    public OrdenReparacion(String numero_Orden, Equipo equipo, Servicio servicio, String observaciones) {
        this.numero_Orden = numero_Orden;
        this.equipo = equipo;
        this.servicio = servicio;
        this.observaciones = observaciones;
    }
    
    //Funciones
    public double getCosto(){
        return servicio.costo_Servicio();
    }
    
    public String getPropietario(){
        return equipo.getNombre_Cliente();
    }    
}