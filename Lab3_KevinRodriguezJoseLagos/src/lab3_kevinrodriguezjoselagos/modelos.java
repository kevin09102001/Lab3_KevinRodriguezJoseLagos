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
public class modelos {

    protected String Nombre_Modelo;
    protected int Año_Fabricacion;
    protected String Tipo_de_motor;
    protected int cilindrada_del_motor;
    protected int precio;
    protected String Tecologias;

    public modelos() {
    }

    public modelos(String Nombre_Modelo, int Año_Fabricacion, String Tipo_de_motor, int cilindrada_del_motor, int precio, String Tecologias) {
        this.Nombre_Modelo = Nombre_Modelo;
        this.Año_Fabricacion = Año_Fabricacion;
        this.Tipo_de_motor = Tipo_de_motor;
        this.cilindrada_del_motor = cilindrada_del_motor;
        this.precio = precio;
        this.Tecologias = Tecologias;
    }

    public String getNombre_Modelo() {
        return Nombre_Modelo;
    }

    public void setNombre_Modelo(String Nombre_Modelo) {
        this.Nombre_Modelo = Nombre_Modelo;
    }

    public int getAño_Fabricacion() {
        return Año_Fabricacion;
    }

    public void setAño_Fabricacion(int Año_Fabricacion) {
        this.Año_Fabricacion = Año_Fabricacion;
    }

    public String getTipo_de_motor() {
        return Tipo_de_motor;
    }

    public void setTipo_de_motor(String Tipo_de_motor) {
        this.Tipo_de_motor = Tipo_de_motor;
    }

    public int getCilindrada_del_motor() {
        return cilindrada_del_motor;
    }

    public void setCilindrada_del_motor(int cilindrada_del_motor) {
        this.cilindrada_del_motor = cilindrada_del_motor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTecologias() {
        return Tecologias;
    }

    public void setTecologias(String Tecologias) {
        this.Tecologias = Tecologias;
    }

    @Override
    public String toString() {
        return "modelos{" + "Nombre_Modelo=" + Nombre_Modelo + ", A\u00f1o_Fabricacion=" + Año_Fabricacion + ", Tipo_de_motor=" + Tipo_de_motor + ", cilindrada_del_motor=" + cilindrada_del_motor + ", precio=" + precio + ", Tecologias=" + Tecologias + '}';
    }

}
