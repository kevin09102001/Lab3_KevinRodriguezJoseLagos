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
public class Hatchback extends modelos{
    protected int capacidad_de_maletero;
     protected double Longitud_total;
    protected int bolsas_de_aire;

    public Hatchback() {
        super();
    }

    public Hatchback(int capacidad_de_maletero, double Longitud_total, int bolsas_de_aire, String Nombre_Modelo, int Año_Fabricacion, String Tipo_de_motor, int cilindrada_del_motor, int precio, String Tecologias) {
        super(Nombre_Modelo, Año_Fabricacion, Tipo_de_motor, cilindrada_del_motor, precio, Tecologias);
        this.capacidad_de_maletero = capacidad_de_maletero;
        this.Longitud_total = Longitud_total;
        this.bolsas_de_aire = bolsas_de_aire;
    }

    public int getCapacidad_de_maletero() {
        return capacidad_de_maletero;
    }

    public void setCapacidad_de_maletero(int capacidad_de_maletero) {
        this.capacidad_de_maletero = capacidad_de_maletero;
    }

    public double getLongitud_total() {
        return Longitud_total;
    }

    public void setLongitud_total(double Longitud_total) {
        this.Longitud_total = Longitud_total;
    }

    public int getBolsas_de_aire() {
        return bolsas_de_aire;
    }

    public void setBolsas_de_aire(int bolsas_de_aire) {
        this.bolsas_de_aire = bolsas_de_aire;
    }

    @Override
    public String toString() {
        return super.toString()+" Hatchback{" + "capacidad_de_maletero=" + capacidad_de_maletero + ", Longitud_total=" + Longitud_total + ", bolsas_de_aire=" + bolsas_de_aire + '}';
    }
    
    
    
    
   
}
