/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medactema14.practica_intermodular;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Planetas {
    private String nombre;
    private float radio;
    private float distancia_sol;
    private float periodo_orbital;
    private float temperatura;
    private String tipo;
    private int num_satelites;
    private ArrayList<Satelites> satelites;
    private Date fecha_creacion;

    public Planetas(String nombre, float radio, float distancia_sol, float periodo_orbital, float temperatura, String tipo, int num_satelites, ArrayList<Satelites> satelites, Date fecha_creacion) {
        this.nombre = nombre;
        this.radio = radio;
        this.distancia_sol = distancia_sol;
        this.periodo_orbital = periodo_orbital;
        this.temperatura = temperatura;
        this.tipo = tipo;
        this.num_satelites = num_satelites;
        this.satelites = satelites;
        this.fecha_creacion = fecha_creacion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(float distancia_sol) {
        this.distancia_sol = distancia_sol;
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

    public int getNum_satelites() {
        return num_satelites;
    }

    public void setNum_satelites(int num_satelites) {
        this.num_satelites = num_satelites;
    }

    public ArrayList<Satelites> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelites> satelites) {
        this.satelites = satelites;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", radio=" + radio + ", distancia_sol=" + distancia_sol + ", periodo_orbital=" + periodo_orbital + ", temperatura=" + temperatura + ", tipo=" + tipo + ", num_satelites=" + num_satelites + ", satelites=" + satelites + ", fecha_creacion=" + fecha_creacion + '}';
    }

   
    
}
