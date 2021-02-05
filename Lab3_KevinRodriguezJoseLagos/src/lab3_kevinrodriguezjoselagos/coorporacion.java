/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_kevinrodriguezjoselagos;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class coorporacion {
    private String nombre;
    private String sede;
    private int año_fundacion;
    private String Presidente;
    private int total_empleados;
    private int cantidad_de_autos;
     ArrayList <marcas> lista=new ArrayList();

    public coorporacion() {
    }

    public coorporacion(String nombre, String sede, int año_fundacion, String Presidente, int total_empleados, int cantidad_de_autos) {
        this.nombre = nombre;
        this.sede = sede;
        this.año_fundacion = año_fundacion;
        this.Presidente = Presidente;
        this.total_empleados = total_empleados;
        this.cantidad_de_autos = cantidad_de_autos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getAño_fundacion() {
        return año_fundacion;
    }

    public void setAño_fundacion(int año_fundacion) {
        this.año_fundacion = año_fundacion;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public int getTotal_empleados() {
        return total_empleados;
    }

    public void setTotal_empleados(int total_empleados) {
        this.total_empleados = total_empleados;
    }

    public int getCantidad_de_autos() {
        return cantidad_de_autos;
    }

    public void setCantidad_de_autos(int cantidad_de_autos) {
        this.cantidad_de_autos = cantidad_de_autos;
    }

    public ArrayList<marcas> getLista() {
        return lista;
    }

    public void setLista(ArrayList<marcas> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "coorporacion{" + "nombre=" + nombre + ", sede=" + sede + ", a\u00f1o_fundacion=" + año_fundacion + ", Presidente=" + Presidente + ", total_empleados=" + total_empleados + ", cantidad_de_autos=" + cantidad_de_autos + ", lista=" + lista + '}';
    }

   
}
