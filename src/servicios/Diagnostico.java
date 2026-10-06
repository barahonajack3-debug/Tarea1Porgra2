/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

/**
 *
 * @author USER
 */
public class Diagnostico implements Servicio{
    //Atr
    private String tipo; //Normal o Avanzado

    //Met get
    public String getTipo() {
        return tipo;
    }

    //Met set
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Constructor
    public Diagnostico(String tipo) {
        this.tipo = tipo;
    }
    
    //Funciones
    @Override
    public String nombre_Servicio() {
        return "Diagnostico";
    }

    @Override
    public double costo_Servicio() {
        double costo;
        if(tipo.equals("Normal")){
            costo=8000;
        }else{
            costo=12000;
        }
        return costo;
    }

    @Override
    public String descripcion_Ser() {
        return "Diagnostico"+
             "\nTipo: "+tipo;
    }  
}