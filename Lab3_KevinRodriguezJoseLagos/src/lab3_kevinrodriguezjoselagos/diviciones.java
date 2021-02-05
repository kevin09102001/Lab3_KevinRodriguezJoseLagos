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
public class diviciones {

    String nombre;
    String añocre;
    String campodedi;
    String Tecnologia_desarrollada;

    public diviciones() {
    }

    public diviciones(String nombre, String añocre, String campodedi, String Tecnologia_desarrollada) {
        this.nombre = nombre;
        this.añocre = añocre;
        this.campodedi = campodedi;
        this.Tecnologia_desarrollada = Tecnologia_desarrollada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAñocre() {
        return añocre;
    }

    public void setAñocre(String añocre) {
        this.añocre = añocre;
    }

    public String getCampodedi() {
        return campodedi;
    }

    public void setCampodedi(String campodedi) {
        this.campodedi = campodedi;
    }

    public String getTecnologia_desarrollada() {
        return Tecnologia_desarrollada;
    }

    public void setTecnologia_desarrollada(String Tecnologia_desarrollada) {
        this.Tecnologia_desarrollada = Tecnologia_desarrollada;
    }

    @Override
    public String toString() {
        return "diviciones{" + "nombre=" + nombre + ", a\u00f1ocre=" + añocre + ", campodedi=" + campodedi + ", Tecnologia_desarrollada=" + Tecnologia_desarrollada + '}';
    }

}
