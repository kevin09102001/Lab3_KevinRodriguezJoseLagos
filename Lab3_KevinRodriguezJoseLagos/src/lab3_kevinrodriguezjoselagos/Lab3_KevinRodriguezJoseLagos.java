/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_kevinrodriguezjoselagos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Lab3_KevinRodriguezJoseLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int rep = 1;
        ArrayList listado_corp = new ArrayList();
        ArrayList listado_marca = new ArrayList();
        ArrayList listado_model = new ArrayList();
        ArrayList listado_farbic= new ArrayList();
        ArrayList listado_divTec = new ArrayList();
        ArrayList listado_ttl = new ArrayList();
        while (rep == 1) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("    MENU\n"
                    + "1. Corporaciones\n"
                    + "2. Marcas\n"
                    + "3. Modelos\n"
                    + "4. Fábricas\n"
                    + "5. Divisiones tecnologicas\n"
                    + "6. Informe total\n"
                    + "7. Salir"
                    + "Ingrese su opcion"));

            switch (opcion) {
                case 1:{
                    int option = Integer.parseInt(JOptionPane.showInputDialog("     Corporaciones\n"
                            + "1. Agregar coporacion\n"
                            + "2. Modificar corporacion\n"
                            + "3. Eliminar corporacion\n"
                            + "4. Listar corporaciones\n"
                            + "Ingrese su opcion"));
                    
                    switch (option){
                        case 1:{
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la corporacion");
                            String sede = JOptionPane.showInputDialog("Ingrese la sede");
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                            String ceo = JOptionPane.showInputDialog("Ingrese el nombre del CEO o presidente");
                            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
                            int can_autos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos que se pueden fabricar"));
                            
                            listado_corp.add(new coorporacion(nombre, sede, año, ceo, empleados, can_autos));
                            break;
                        }
                        case 2:{
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la corporacion a modificar"));
                            
                            if (listado_corp.get(position) instanceof coorporacion) {
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre de corporacion\n"
                                        + "2. Sede\n"
                                        + "3. Año de fundacion\n"
                                        + "4. CEO o presidente\n"
                                        + "5. Numero de Empleados\n"
                                        + "6. Cantidad de autos\n"
                                        + "Ingrese opcion a modificar"));
                                
                                switch(posicion){
                                    case 1:{
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                        ((coorporacion) listado_corp.get(position)).setNombre(aux);
                                        break;
                                    }
                                    case 2:{
                                        String aux = JOptionPane.showInputDialog("Ingrese la nueva sede");
                                        ((coorporacion) listado_corp.get(position)).setSede(aux);
                                        break;
                                    }
                                    case 3:{
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                                        ((coorporacion) listado_corp.get(position)).setAño_fundacion(aux);
                                        break;
                                    }
                                    case 4:{
                                        String aux = JOptionPane.showInputDialog("Ingrese el nombre del nuevo CEO o presidente");
                                        ((coorporacion) listado_corp.get(position)).setPresidente(aux);
                                        break;
                                    }
                                    case 5:{
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de empleados"));
                                        ((coorporacion) listado_corp.get(position)).setTotal_empleados(aux);
                                        break;
                                    }
                                    case 6:{
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad de autos"));
                                        ((coorporacion) listado_corp.get(position)).setCantidad_de_autos(aux);
                                        break;
                                    }
                                    default:{
                                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                                        break;
                                    }
                                    
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 3:{
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de la corporacion que quiere eliminar"));
                            
                            if (listado_corp.get(position) instanceof coorporacion) {
                                listado_corp.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 4:{
                            String salida = "";
                            for (Object t : listado_corp) {
                                if (t instanceof coorporacion) {
                                    salida += listado_corp.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;                      
                        }
                        default:{
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    int option = Integer.parseInt(JOptionPane.showInputDialog("     Marcas\n"
                            + "1. Agregar Marca\n"
                            + "2. Modificar Marca\n"
                            + "3. Eliminar Marca\n"
                            + "4. Listar Marcas\n"
                            + "Ingrese su opcion"));
                    
                    switch(option){
                        case 1:{
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la marca");
                            String slogan = JOptionPane.showInputDialog("Ingrese el slogan o lema");
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                            int año_i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de integracion a la corporacion"));
                            String fundador = JOptionPane.showInputDialog("Ingrese el nombre del fundador");
                            int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas anuales"));
                            String ceo = JOptionPane.showInputDialog("Ingrese el nombre del CEO o el presidente");
                            int modelos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de modelos"));
                            
                            listado_marca.add(new marcas(nombre, slogan, año, año_i, fundador, ventas, ceo, modelos));
                            break;
                        }
                        case 2:{
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion de la marca a modificar"));
                            
                            if (listado_marca.get(position) instanceof marcas) {
                                int aux = Integer.parseInt(JOptionPane.showInputDialog(""));
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 3:{
                            
                            break;
                        }
                        case 4:{
                            
                            break;
                        }
                        default:{
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                        }
                    }
                   break;
                }
                case 3:{
                    
                    break;
                }
                case 4:{
                    
                    break;
                }
                case 5:{
                   
                    break;
                }
                case 6:{
                    
                    break;
                }
                case 7:{
                   rep = 2;
                   JOptionPane.showMessageDialog(null, "Ha salido del programa");
                   break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        }
    }

    
}
