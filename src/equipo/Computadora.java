/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

/**
 *
 * @author USER
 */
public class Computadora extends Equipo{
    //Atributos
    private String sistema_Operativo;
    private String tipo_compu; //Portátil o Escritorio

    //Metodos get
    public String getSistema_Operativo() {
        return sistema_Operativo;
    }
    public String getTipo_compu() {
        return tipo_compu;
    }
    
    //Metodos set
    public void setSistema_Operativo(String sistema_Operativo) {
        this.sistema_Operativo = sistema_Operativo;
    }
    public void setTipo_compu(String tipo_compu) {
        this.tipo_compu = tipo_compu;
    }
    
    //Constrctor
    public Computadora(String codigo, String nombre_Cliente, String marca,
                   String tipo_compu, String sistema_Operativo) {
    super(codigo, nombre_Cliente, marca);
    this.tipo_compu = tipo_compu;
    this.sistema_Operativo = sistema_Operativo;
    }

    //Funciones
    @Override
    public String obtenerDescripcion() {
        return "El sistema operativo es: "+sistema_Operativo+
             "\nEl tipo de computadora es: "+tipo_compu;
    }  
} 