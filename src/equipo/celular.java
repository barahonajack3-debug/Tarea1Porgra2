/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

/**
 *
 * @author USER
 */
public class Celular extends Equipo{
    //Atr
    private String sistema_Operativo;
    private String IMEI;
    
    //Met get
    public String getSistema_Operativo() {
        return sistema_Operativo;
    }
    public String getIMEI() {
        return IMEI;
    }

    //Constrctor
    public Celular(String codigo, String nombre_Cliente, String maraca) {
        super(codigo, nombre_Cliente, maraca);
    }

    //Funciones
    @Override
    public String obtenerDescripcion() {
        return "El sistema operativo: "+sistema_Operativo+
             "\nEl IMEI es: "+IMEI;
    }   
}