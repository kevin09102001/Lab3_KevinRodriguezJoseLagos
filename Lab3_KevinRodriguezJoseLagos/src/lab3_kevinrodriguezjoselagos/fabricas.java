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
public class fabricas {

    protected String nombre_fabrica;
    protected String ubicacion;
    protected int Cantidad_maxima_fabricar;
    protected String Tipo_de_carroceria;
    protected int cant_Empleados;
    protected int cant_Autos;

    public fabricas() {
    }

    public fabricas(String nombre_fabrica, String ubicacion, int Cantidad_maxima_fabricar, String Tipo_de_carroceria, int cant_Empleados, int cant_Autos) {
        this.nombre_fabrica = nombre_fabrica;
        this.ubicacion = ubicacion;
        this.Cantidad_maxima_fabricar = Cantidad_maxima_fabricar;
        this.Tipo_de_carroceria = Tipo_de_carroceria;
        this.cant_Empleados = cant_Empleados;
        this.cant_Autos = cant_Autos;
    }

    public String getNombre_fabrica() {
        return nombre_fabrica;
    }

    public void setNombre_fabrica(String nombre_fabrica) {
        this.nombre_fabrica = nombre_fabrica;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidad_maxima_fabricar() {
        return Cantidad_maxima_fabricar;
    }

    public void setCantidad_maxima_fabricar(int Cantidad_maxima_fabricar) {
        this.Cantidad_maxima_fabricar = Cantidad_maxima_fabricar;
    }

    public String getTipo_de_carroceria() {
        return Tipo_de_carroceria;
    }

    public void setTipo_de_carroceria(String Tipo_de_carroceria) {
        this.Tipo_de_carroceria = Tipo_de_carroceria;
    }

    public int getCant_Empleados() {
        return cant_Empleados;
    }

    public void setCant_Empleados(int cant_Empleados) {
        this.cant_Empleados = cant_Empleados;
    }

    public int getCant_Autos() {
        return cant_Autos;
    }

    public void setCant_Autos(int cant_Autos) {
        this.cant_Autos = cant_Autos;
    }

    @Override
    public String toString() {
        return "fabricas{" + "nombre_fabrica=" + nombre_fabrica + ", ubicacion=" + ubicacion + ", Cantidad_maxima_fabricar=" + Cantidad_maxima_fabricar + ", Tipo_de_carroceria=" + Tipo_de_carroceria + ", cant_Empleados=" + cant_Empleados + ", cant_Autos=" + cant_Autos + '}';
    }

}
