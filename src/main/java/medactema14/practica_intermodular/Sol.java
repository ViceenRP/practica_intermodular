/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package medactema14.practica_intermodular;
import java.util.Date;
/**
 *
 * @author Usuario
 */
public class Sol {
    private String nombre;
    private String tipo;
    private int radio;
    private int temperatura;
    private float distancia_tierra;
    private String composicion;
    private Date fecha_creacion;

    public Sol(String nombre, String tipo, int radio, int temperatura, float distancia_tierra, String composicion, Date fecha_creacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.radio = radio;
        this.temperatura = temperatura;
        this.distancia_tierra = distancia_tierra;
        this.composicion = composicion;
        this.fecha_creacion = fecha_creacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public float getDistancia_tierra() {
        return distancia_tierra;
    }

    public void setDistancia_tierra(float distancia_tierra) {
        this.distancia_tierra = distancia_tierra;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Sol{" + "nombre=" + nombre + ", tipo=" + tipo + ", radio=" + radio + ", temperatura=" + temperatura + ", distancia_tierra=" + distancia_tierra + ", composicion=" + composicion + ", fecha_creacion=" + fecha_creacion + '}';
    }
    
}
