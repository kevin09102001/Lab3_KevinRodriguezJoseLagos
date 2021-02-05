/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_kevinrodriguezjoselagos;

/**
 *
 * @author Kevin
 */
public class marcas {
    protected String nombre;
    protected String lema;
    protected int año_de_fundacion;
    protected int año_que_seintegro;
    protected String Fundador;
    protected int total_ventas;
    protected String Presidente;
    protected int num_modelos;

    public marcas() {
    }

    public marcas(String nombre, String lema, int año_de_fundacion, int año_que_seintegro, String Fundador, int total_ventas, String Presidente, int num_modelos) {
        this.nombre = nombre;
        this.lema = lema;
        this.año_de_fundacion = año_de_fundacion;
        this.año_que_seintegro = año_que_seintegro;
        this.Fundador = Fundador;
        this.total_ventas = total_ventas;
        this.Presidente = Presidente;
        this.num_modelos = num_modelos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public int getAño_de_fundacion() {
        return año_de_fundacion;
    }

    public void setAño_de_fundacion(int año_de_fundacion) {
        this.año_de_fundacion = año_de_fundacion;
    }

    public int getAño_que_seintegro() {
        return año_que_seintegro;
    }

    public void setAño_que_seintegro(int año_que_seintegro) {
        this.año_que_seintegro = año_que_seintegro;
    }

    public String getFundador() {
        return Fundador;
    }

    public void setFundador(String Fundador) {
        this.Fundador = Fundador;
    }

    public int getTotal_ventas() {
        return total_ventas;
    }

    public void setTotal_ventas(int total_ventas) {
        this.total_ventas = total_ventas;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public int getNum_modelos() {
        return num_modelos;
    }

    public void setNum_modelos(int num_modelos) {
        this.num_modelos = num_modelos;
    }

    @Override
    public String toString() {
        return "marcas{" + "nombre=" + nombre + ", lema=" + lema + ", a\u00f1o_de_fundacion=" + año_de_fundacion + ", a\u00f1o_que_seintegro=" + año_que_seintegro + ", Fundador=" + Fundador + ", total_ventas=" + total_ventas + ", Presidente=" + Presidente + ", num_modelos=" + num_modelos + '}';
    }
    
    
}
