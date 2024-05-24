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
class Satelites {
    private String nombre;
    private Planetas planeta;
    private float radio, distancia_planeta, periodo_orbital, temperatura;
    private String tipo;
    private Date fecha_creacion;

    public Satelites(String nombre, Planetas planeta, float radio, float distancia_planeta, float periodo_orbital, float temperatura, String tipo, Date fecha_creacion) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.radio = radio;
        this.distancia_planeta = distancia_planeta;
        this.periodo_orbital = periodo_orbital;
        this.temperatura = temperatura;
        this.tipo = tipo;
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(float distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public float getPeriodo_orbital() {
        return periodo_orbital;
    }

    public void setPeriodo_orbital(float periodo_orbital) {
        this.periodo_orbital = periodo_orbital;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Satelites{" + "nombre=" + nombre + ", planeta=" + planeta + ", radio=" + radio + ", distancia_planeta=" + distancia_planeta + ", periodo_orbital=" + periodo_orbital + ", temperatura=" + temperatura + ", tipo=" + tipo + ", fecha_creacion=" + fecha_creacion + '}';
    }
    
}
