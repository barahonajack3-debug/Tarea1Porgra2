/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

/**
 *
 * @author USER
 */
public abstract class Equipo {
    //Atributos
    private String codigo;
    private  String nombre_Cliente;
    private  String maraca;
    
    //Metodos get
    public String getCodigo() {
        return codigo;
    }
    public String getNombre_Cliente() {
        return nombre_Cliente;
    }
    public String getMaraca() {
        return maraca;
    }
    
    //Metodos set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //Constructor
    public Equipo(String codigo, String nombre_Cliente, String maraca) {
        this.codigo = codigo;
        this.nombre_Cliente = nombre_Cliente;
        this.maraca = maraca;
    }

    //Funciones
    public abstract String obtenerDescripcion();
}