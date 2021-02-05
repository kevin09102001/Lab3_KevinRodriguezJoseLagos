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
        ArrayList listado = new ArrayList();
        
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
                            String año = JOptionPane.showInputDialog("Ingrese el año de fundacion");
                            String ceo = JOptionPane.showInputDialog("Ingrese el nombre del CEO o presidente");
                            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
                            int can_autos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos que se pueden fabricar"));
                            
                            break;
                        }
                        case 2:{
                            
                            break;
                        }
                        case 3:{
                            
                            break;
                        }
                        case 4:{
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de la corporacion que quiere eliminar"));
                            
                            if (listado.get(position) instanceof ) {
                                listado.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            
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
