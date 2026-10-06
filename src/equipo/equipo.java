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
    //Atr
    private String codigo;
    private  String nombre_Cliente;
    private  String marca;
    
    //Metodos get
    public String getCodigo() {
        return codigo;
    }
    public String getNombre_Cliente() {
        return nombre_Cliente;
    }
    public String getMaraca() {
        return marca;
    }
    
    //Metodos set
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre_Cliente(String nombre_Cliente) {
        this.nombre_Cliente = nombre_Cliente;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Constructor
    public Equipo(String codigo, String nombre_Cliente, String maraca) {
        this.codigo = codigo;
        this.nombre_Cliente = nombre_Cliente;
        this.marca = maraca;
    }

    //Funciones
    public abstract String obtenerDescripcion();
}