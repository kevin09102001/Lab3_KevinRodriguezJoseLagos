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
public class Sedán extends modelos {

    protected String androidPlay;
    protected String androidAuto;
    protected ArrayList<String> asistente;

    public Sedán() {
        super();
    }

    public Sedán(String androidPlay, String androidAuto, ArrayList<String> asistente) {
        this.androidPlay = androidPlay;
        this.androidAuto = androidAuto;
        this.asistente = asistente;
    }

    public Sedán(String androidPlay, String androidAuto, ArrayList<String> asistente, String Nombre_Modelo, int Año_Fabricacion, String Tipo_de_motor, int cilindrada_del_motor, int precio, String Tecologias) {
        super(Nombre_Modelo, Año_Fabricacion, Tipo_de_motor, cilindrada_del_motor, precio, Tecologias);
        this.androidPlay = androidPlay;
        this.androidAuto = androidAuto;
        this.asistente = asistente;
    }

    public String getAndroidPlay() {
        return androidPlay;
    }

    public void setAndroidPlay(String androidPlay) {
        this.androidPlay = androidPlay;
    }

    public String getAndroidAuto() {
        return androidAuto;
    }

    public void setAndroidAuto(String androidAuto) {
        this.androidAuto = androidAuto;
    }

    public ArrayList<String> getAsistente() {
        return asistente;
    }

    public void setAsistente(ArrayList<String> asistente) {
        this.asistente = asistente;
    }

    @Override
    public String toString() {
        return super.toString() + "androidPlay=" + androidPlay + ", androidAuto=" + androidAuto + ", asistente=" + asistente + '}';
    }

}
