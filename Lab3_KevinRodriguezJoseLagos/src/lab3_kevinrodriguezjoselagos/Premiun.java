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
public class Premiun extends marcas {

    protected String nombre_de_su_división_deportiva;
    protected String nombre_de_su_división_de_lujo;
    protected String tipo;

    public Premiun() {
        super();
    }

    public Premiun(String nombre_de_su_división_deportiva, String nombre_de_su_división_de_lujo, String tipo, String nombre, String lema, int año_de_fundacion, int año_que_seintegro, String Fundador, int total_ventas, String Presidente, int num_modelos) {
        super(nombre, lema, año_de_fundacion, año_que_seintegro, Fundador, total_ventas, Presidente, num_modelos);
        this.nombre_de_su_división_deportiva = nombre_de_su_división_deportiva;
        this.nombre_de_su_división_de_lujo = nombre_de_su_división_de_lujo;
        this.tipo = tipo;
    }

    public String getNombre_de_su_división_deportiva() {
        return nombre_de_su_división_deportiva;
    }

    public void setNombre_de_su_división_deportiva(String nombre_de_su_división_deportiva) {
        this.nombre_de_su_división_deportiva = nombre_de_su_división_deportiva;
    }

    public String getNombre_de_su_división_de_lujo() {
        return nombre_de_su_división_de_lujo;
    }

    public void setNombre_de_su_división_de_lujo(String nombre_de_su_división_de_lujo) {
        this.nombre_de_su_división_de_lujo = nombre_de_su_división_de_lujo;
    }

    
    @Override
    public String toString() {
        return super.toString()+ "Premiun =" + "nombre_de_su_division deportiva=" + nombre_de_su_división_deportiva + ", nombre_de_su_divisi\u00f3n_de_lujo=" + nombre_de_su_división_de_lujo + ", tipo=" + tipo + '}';
    }

}
