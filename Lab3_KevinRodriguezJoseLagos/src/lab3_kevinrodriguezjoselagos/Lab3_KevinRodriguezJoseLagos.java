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
        ArrayList listado_fabric = new ArrayList();
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
                    + "7. Salir\n"
                    + "Ingrese su opcion"));

            switch (opcion) {
                case 1: {
                    int option = Integer.parseInt(JOptionPane.showInputDialog("     Corporaciones\n"
                            + "1. Agregar coporacion\n"
                            + "2. Modificar corporacion\n"
                            + "3. Eliminar corporacion\n"
                            + "4. Listar corporaciones\n"
                            + "Ingrese su opcion"));

                    switch (option) {
                        case 1: {
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la corporacion");
                            String sede = JOptionPane.showInputDialog("Ingrese la sede");
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                            String ceo = JOptionPane.showInputDialog("Ingrese el nombre del CEO o presidente");
                            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
                            int can_autos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos que se pueden fabricar"));

                            listado_corp.add(new coorporacion(nombre, sede, año, ceo, empleados, can_autos));
                            break;
                        }
                        case 2: {
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la corporacion a modificar"));

                            if (listado_corp.get(position) instanceof coorporacion) {
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre de corporacion\n"
                                        + "2. Sede\n"
                                        + "3. Año de fundacion\n"
                                        + "4. CEO o presidente\n"
                                        + "5. Numero de Empleados\n"
                                        + "6. Cantidad de autos\n"
                                        + "Ingrese opcion a modificar"));

                                switch (posicion) {
                                    case 1: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                        ((coorporacion) listado_corp.get(position)).setNombre(aux);
                                        break;
                                    }
                                    case 2: {
                                        String aux = JOptionPane.showInputDialog("Ingrese la nueva sede");
                                        ((coorporacion) listado_corp.get(position)).setSede(aux);
                                        break;
                                    }
                                    case 3: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                                        ((coorporacion) listado_corp.get(position)).setAño_fundacion(aux);
                                        break;
                                    }
                                    case 4: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nombre del nuevo CEO o presidente");
                                        ((coorporacion) listado_corp.get(position)).setPresidente(aux);
                                        break;
                                    }
                                    case 5: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de empleados"));
                                        ((coorporacion) listado_corp.get(position)).setTotal_empleados(aux);
                                        break;
                                    }
                                    case 6: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad de autos"));
                                        ((coorporacion) listado_corp.get(position)).setCantidad_de_autos(aux);
                                        break;
                                    }
                                    default: {
                                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                                        break;
                                    }

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 3: {
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de la corporacion que quiere eliminar"));

                            if (listado_corp.get(position) instanceof coorporacion) {
                                listado_corp.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 4: {
                            String salida = "";
                            for (Object t : listado_corp) {
                                if (t instanceof coorporacion) {
                                    salida += listado_corp.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;
                        }
                        default: {
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    int option = Integer.parseInt(JOptionPane.showInputDialog("     Marcas\n"
                            + "1. Agregar Marca\n"
                            + "2. Modificar Marca\n"
                            + "3. Eliminar Marca\n"
                            + "4. Listar Marcas\n"
                            + "Ingrese su opcion"));

                    switch (option) {
                        case 1: {
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la marca");
                            String slogan = JOptionPane.showInputDialog("Ingrese el slogan o lema");
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                            int año_i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de integracion a la corporacion"));
                            String fundador = JOptionPane.showInputDialog("Ingrese el nombre del fundador");
                            int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas anuales"));
                            String ceo = JOptionPane.showInputDialog("Ingrese el nombre del CEO o el presidente");
                            int modelos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de modelos"));
                            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la clase de marca\n"
                                    + "1. Premium\n"
                                    + "2. Generalista"));
                            if(op == 1){
                                String div_dep = JOptionPane.showInputDialog("Ingrese nombre de la division deportiva");
                                String div_lujo = JOptionPane.showInputDialog("Ingrese nombre de la division de lujo");
                                int carroceria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de carroceria\n"
                                        + "1. Sedán\n"
                                        + "2. Hatchback\n"
                                        + "3. Coupé"));
                                switch(carroceria){
                                    case 1:{
                                        listado_marca.add(new Premiun(div_dep, div_lujo, "Sedan",nombre, slogan, año, año_i, fundador, ventas, ceo, modelos));
                                        break;
                                    }
                                    case 2:{
                                        listado_marca.add(new Premiun(div_dep, div_lujo, "Hatchback",nombre, slogan, año, año_i, fundador, ventas, ceo, modelos));
                                       
                                        break;
                                    }
                                    case 3:{
                                        
                                        listado_marca.add(new Premiun(div_dep, div_lujo, "Hatchback",nombre, slogan, año, año_i, fundador, ventas, ceo, modelos));                                        break;
                                    }
                                }
                            }
                            else if(op == 2){
                                int Op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la marca su tipo\n"
                                        + "1. Low-cost\n"
                                        + "2.Semi-premium"));
                                switch (Op){
                                    case 1:{
                                        listado_marca.add(new Generalista("low-cost",nombre, slogan, año, año_i, fundador, ventas, ceo, modelos));
                                    }
                                    case 2:{
                                        listado_marca.add(new Generalista("semi-premium",nombre, slogan, año, año_i, fundador, ventas, ceo, modelos));
                                    }
                                }
                            }
                           
                            break;
                        }
                        case 2: {
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion de la marca a modificar"));

                            if (listado_marca.get(position) instanceof marcas) {
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre\n"
                                        + "2. Slogan o lema\n"
                                        + "3. Año de fundacion\n"
                                        + "4. Año que se integró a la corp.\n"
                                        + "5. Nombre del fundador\n"
                                        + "6. Numero de ventas anuales\n"
                                        + "7. Nombre del CEO o presidente\n"
                                        + "8. Numero de modelos\n"
                                        + "9. Tipo\n"
                                        + "Ingrese su opcion"));
                                switch (posicion) {
                                    case 1: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                        ((marcas) listado_marca.get(position)).setNombre(aux);
                                        break;
                                    }
                                    case 2: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo slogan");
                                        ((marcas) listado_marca.get(position)).setLema(aux);
                                        break;
                                    }
                                    case 3: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fundacion"));
                                        ((marcas) listado_marca.get(position)).setAño_de_fundacion(aux);
                                        break;
                                    }
                                    case 4: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de integracion"));
                                        ((marcas) listado_marca.get(position)).setAño_que_seintegro(aux);
                                        break;
                                    }
                                    case 5: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nombre del fundador");
                                        ((marcas) listado_marca.get(position)).setFundador(aux);
                                        break;
                                    }
                                    case 6: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de ventas anuales"));
                                        ((marcas) listado_marca.get(position)).setTotal_ventas(aux);
                                        break;
                                    }
                                    case 7: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nombre del CEO o Presidente");
                                        ((marcas) listado_marca.get(position)).setPresidente(aux);
                                        break;
                                    }
                                    case 8: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de modelos"));
                                        ((marcas) listado_marca.get(position)).setNum_modelos(aux);
                                        break;
                                    }
                                    default: {
                                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                                        break;
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 3: {
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de la corporacion que quiere eliminar"));

                            if (listado_marca.get(position) instanceof marcas) {
                                listado_marca.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 4: {
                            String salida = "";
                            for (Object t : listado_marca) {
                                if (t instanceof Premiun || t instanceof Generalista) {
                                    salida += listado_marca.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;
                        }
                        default: {
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                        }
                    }
                    break;
                }
                case 3: {
                    int option = Integer.parseInt(JOptionPane.showInputDialog("      Modelos\n"
                            + "1. Agregar Modelo\n"
                            + "2. Modificar Modelo\n"
                            + "3. Eliminar Modelo\n"
                            + "4. Listar Modelo\n"
                            + "Ingrese su opcion"));
                    switch (option) {
                        case 1: {
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del modelo");
                            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion"));
                            String motor = JOptionPane.showInputDialog("Ingrese el tipo de motor");
                            int cilindrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del motor"));
                            int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
                            String tecno = JOptionPane.showInputDialog("Ingrese las tecnologias que contiene");
                            modelos y = new modelos(nombre, año, motor, cilindrada, precio, tecno);
                            
                            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese carroceria\n"
                                    + "1. Hatchback\n"
                                    + "2. Sedán\n"
                                    + "3. SUV"));
                            switch (op){
                                case 1:{
                                    int hatch = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad"));
                                    double longitud = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud"));
                                    int bolsas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de boslas de aire"));
                                    
                                    listado_model.add(new Hatchback(hatch, longitud, bolsas, nombre, año, motor, cilindrada, precio, tecno));
                                    break;
                                }
                                case 2:{
                                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo");
                                    String SN = JOptionPane.showInputDialog("AndroidPlay? [si/no]");
                                    ArrayList<String> asist = new ArrayList();
                                    char res = 's';
                                    while (res == 's'){
                                        asist.add(JOptionPane.showInputDialog("Ingrese el nombre de un asistente"));
                                        res = JOptionPane.showInputDialog("Desea agregar otro asistente? [s/n]").charAt(0);
                                    }
                                    listado_model.add(new Sedán(modelo, SN, asist, nombre, año, motor, cilindrada, precio, tecno));
                                    break;
                                }
                                case 3:{
                                    String modelo = JOptionPane.showInputDialog("Es modelo 4x4? [si/no]");
                                    int pasajeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de pasajeros"));
                                    String navegador = JOptionPane.showInputDialog("Ingrese el nombre del navegador");
                                    
                                    listado_model.add(new SUV(modelo, pasajeros, navegador, nombre, año, motor, cilindrada, precio, tecno));
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion del modelo a modificar"));

                            if (listado_model.get(position) instanceof modelos) {
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre\n"
                                        + "2. Año de fabricacion\n"
                                        + "3. Tipo de motor\n"
                                        + "4. Cilindrada del motor\n"
                                        + "5. Precio del modelo\n"
                                        + "6. Tecnologías\n"
                                        + "Ingrese su opcion"));
                                switch (posicion) {
                                    case 1: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                        ((modelos) listado_model.get(position)).setNombre_Modelo(aux);
                                        break;
                                    }
                                    case 2: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fabricacion"));
                                        ((modelos) listado_model.get(position)).setAño_Fabricacion(aux);
                                        break;
                                    }
                                    case 3: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el tipo de motor");
                                        ((modelos) listado_model.get(position)).setTipo_de_motor(aux);
                                        break;
                                    }
                                    case 4: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cilindrada del motor"));
                                        ((modelos) listado_model.get(position)).setCilindrada_del_motor(aux);
                                        break;
                                    }
                                    case 5: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio"));
                                        ((modelos) listado_model.get(position)).setPrecio(aux);
                                        break;
                                    }
                                    case 6: {
                                        String aux = JOptionPane.showInputDialog("Ingrese la tecnologia");
                                        ((modelos) listado_model.get(position)).setTecologias(aux);
                                        break;
                                    }
                                    default: {
                                        JOptionPane.showMessageDialog(null, "Opcion invalida");
                                        break;
                                    }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 3: {
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion de la corporacion que quiere eliminar"));

                            if (listado_model.get(position) instanceof modelos) {
                                listado_model.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 4: {
                            String salida = "";
                            for (Object t : listado_model) {
                                if (t instanceof Hatchback || t instanceof Sedán || t instanceof SUV) {
                                    salida += listado_model.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;
                        }
                        default: {
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    int option = Integer.parseInt(JOptionPane.showInputDialog("      Fabricas\n"
                            + "1. Agregar Fabrica\n"
                            + "2. Modificar Fabrica\n"
                            + "3. Eliminar Fabrica\n"
                            + "4. Listar Fabrica\n"
                            + "Ingrese su opcion"));
                    switch (option) {
                        case 1: {
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la fabrica");
                            String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion");
                            int cantidad_max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de modelos que se peuden fabricar"));
                            String carroceria = JOptionPane.showInputDialog("Ingrese el tipo de carrocerría mas fabricada");
                            int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
                            String marcas = JOptionPane.showInputDialog("Ingrese nombre de marca que mas se ensamblan");
                            int cantidad_auto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de autos que se fabrican"));

                            listado_fabric.add(new fabricas(nombre, ubicacion, cantidad_max, carroceria, empleados, cantidad_auto));
                        }
                        break;
                        case 2:{
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion de la fabrica a modificar"));

                            if (listado_fabric.get(position) instanceof fabricas) {
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre\n"
                                        + "2. Ubicacion\n"
                                        + "3. Cantidad maxima de modelos que se pueden fabricar\n"
                                        + "4. Carrocería\n"
                                        + "5. Numero de empleados\n"
                                        + "6. Cantidad de autos que se fabrican actualmente\n"
                                        + "Ingrese su opcion"));
                                switch (posicion) {
                                    case 1: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                        ((fabricas) listado_fabric.get(position)).setNombre_fabrica(aux);
                                        break;
                                    }
                                    case 6: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de modelos"));
                                        ((fabricas) listado_fabric.get(position)).setCantidad_maxima_fabricar(aux);
                                        break;
                                    }
                                    case 3: {
                                        String aux = JOptionPane.showInputDialog("Ingrese la carrocería");
                                        ((fabricas) listado_fabric.get(position)).setTipo_de_carroceria(aux);
                                        break;
                                    }
                                    case 4: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
                                        ((fabricas) listado_fabric.get(position)).setCant_Empleados(aux);
                                        break;
                                    }
                                    case 5: {
                                        int aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos en fabrica"));
                                        ((fabricas) listado_fabric.get(position)).setCant_Autos(aux);
                                        break;
                                    }
                                    case 2: {
                                        String aux = JOptionPane.showInputDialog("Ingrese la ubicacion");
                                        ((fabricas) listado_fabric.get(position)).setUbicacion(aux);
                                        break;
                                    }
                                    default: {
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

                            if (listado_fabric.get(position) instanceof fabricas) {
                                listado_fabric.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 4:{
                            String salida = "";
                            for (Object t : listado_fabric) {
                                if (t instanceof fabricas) {
                                    salida += listado_fabric.indexOf(t) + " - " + t + "\n";
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
                case 5: {
                    int option = Integer.parseInt(JOptionPane.showInputDialog("      Division Tecnologica\n"
                            + "1. Agregar Division\n"
                            + "2. Modificar Division\n"
                            + "3. Eliminar Division\n"
                            + "4. Listar Division\n"
                            + "Ingrese su opcion"));
                    switch (option) {
                        case 1: {
                            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la fabrica");
                            String año = JOptionPane.showInputDialog("Ingrese el año de creacion");
                            String campo = JOptionPane.showInputDialog("Ingrese el campo al que se dedican");
                            String tech = JOptionPane.showInputDialog("Ingrese las tecnologias ya desarrolladas");

                            listado_divTec.add(new diviciones(nombre, año, campo, tech));
                        }
                        break;
                        case 2:{
                            int position = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poscion de la fabrica a modificar"));

                            if (listado_divTec.get(position) instanceof diviciones) {
                                int posicion = Integer.parseInt(JOptionPane.showInputDialog("1. Nombre\n"
                                        + "2. Año\n"
                                        + "3. Campo\n"
                                        + "4. Tecnologia\n"));
                                switch (posicion) {
                                    case 1: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                                        ((diviciones) listado_divTec.get(position)).setNombre(aux);
                                        break;
                                    }
                                    case 2: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el año");
                                       ((diviciones) listado_divTec.get(position)).setAñocre(aux);
                                        break;
                                    }
                                    case 3: {
                                        String aux = JOptionPane.showInputDialog("Ingrese el campo");
                                        ((diviciones) listado_divTec.get(position)).setCampodedi(aux);
                                        break;
                                    }
                                    case 4: {
                                        String aux = JOptionPane.showInputDialog("Ingrese la tecnologia");
                                       ((diviciones) listado_divTec.get(position)).setTecnologia_desarrollada(aux);
                                        break;
                                    }
                                   
                                    default: {
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

                            if (listado_divTec.get(position) instanceof diviciones) {
                                listado_divTec.remove(position);
                            } else {
                                JOptionPane.showMessageDialog(null, "La posicion que ingreso no se encuentra en la lista o es invalida");
                            }
                            break;
                        }
                        case 4:{
                            String salida = "";
                            for (Object t : listado_divTec) {
                                if (t instanceof diviciones) {
                                    salida += listado_divTec.indexOf(t) + " - " + t + "\n";
                                }
                            }
                            JOptionPane.showMessageDialog(null, salida);
                            break;
                        }
                        default:{
                            
                            break;
                        }
                    }
                    break;
                }
                case 6: {
                     String corp = "";
                    String marcas = "";
                    String modelos = "";
                    String fabrica = "";
                    String div = "";
                    for (Object t : listado_corp) {
                        if (t instanceof coorporacion) {
                            corp += listado_corp.indexOf(t) + " - " + t + "\n";
                        }
                    }
                    for (Object t : listado_marca) {
                        if (t instanceof Premiun || t instanceof Generalista) {
                            marcas += listado_marca.indexOf(t) + " - " + t + "\n";
                        }
                    }
                    for (Object t : listado_model) {
                        if (t instanceof Hatchback || t instanceof Sedán || t instanceof SUV) {
                            modelos += listado_model.indexOf(t) + " - " + t + "\n";
                        }
                    }
                    for (Object t : listado_fabric) {
                        if (t instanceof fabricas) {
                            fabrica += listado_fabric.indexOf(t) + " - " + t + "\n";
                        }
                    }
                    for (Object t : listado_divTec) {
                        if (t instanceof diviciones) {
                            div += listado_divTec.indexOf(t) + " - " + t + "\n";
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, "Marcas: \n"+marcas+"\nModelos:\n"+modelos+"\nFabricas:\n"+fabrica+"\nDiviciones Tecnologicas:\n"+div);
                    break;
                }
                case 7: {
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