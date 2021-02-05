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
public class Generalista extends marcas {
    protected String tipo;

    public Generalista() {
        super();
    }

    public Generalista(String tipo) {
        this.tipo = tipo;
    }

    public Generalista(String tipo, String nombre, String lema, int año_de_fundacion, int año_que_seintegro, String Fundador, int total_ventas, String Presidente, int num_modelos) {
        super(nombre, lema, año_de_fundacion, año_que_seintegro, Fundador, total_ventas, Presidente, num_modelos);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Generalista{" + "tipo=" + tipo + '}';
    }

}
