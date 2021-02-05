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
public class SUV extends modelos{
     protected String cuatroxcuatro;
     protected int cant;
     protected String Nombre_navegador;

    public SUV() {
        super();
    }


    public SUV(String cuatroxcuatro, int cant, String Nombre_navegador, String Nombre_Modelo, int Año_Fabricacion, String Tipo_de_motor, int cilindrada_del_motor, int precio, String Tecologias) {
        super(Nombre_Modelo, Año_Fabricacion, Tipo_de_motor, cilindrada_del_motor, precio, Tecologias);
        this.cuatroxcuatro = cuatroxcuatro;
        this.cant = cant;
        this.Nombre_navegador = Nombre_navegador;
    }

    public String getCuatroxcuatro() {
        return cuatroxcuatro;
    }

    public void setCuatroxcuatro(String cuatroxcuatro) {
        this.cuatroxcuatro = cuatroxcuatro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getNombre_navegador() {
        return Nombre_navegador;
    }

    public void setNombre_navegador(String Nombre_navegador) {
        this.Nombre_navegador = Nombre_navegador;
    }

    @Override
    public String toString() {
        return super.toString()+"SUV{" + "cuatroxcuatro=" + cuatroxcuatro + ", cant=" + cant + ", Nombre_navegador=" + Nombre_navegador + '}';
    }
    
     
     
}
