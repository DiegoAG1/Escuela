/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import javax.swing.JOptionPane;

/**
 * Rafael Villeda Reza Diego Armando Gonzalez Montes de Oca
 */
public class Principal {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        String verdura;
        ArbolBinario arbolito = new ArbolBinario();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar una Verdura\n"
                        + "2. Eliminar una Verdura\n"
                        + "3. Buscar una Verdura\n"
                        + "4. Mostrar Verduras\n"
                        + "5. Salir\n"
                        + " Elige Una Opcion...", "Arboles Binarios",
                        JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el numero del Nodo... ", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE));
                        verdura = JOptionPane.showInputDialog(null,
                                "Ingresa el Nombre de la verdura...", "Agregando Nodo",
                                JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, verdura);
                        break;
                    case 2:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el numero del Nodo a Eliminar... ", "Eliminando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "El Nodo no encontra en el arbol",
                                        "¡Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "El Nodo ha sido eliminado del arbol",
                                        "¡Nodo Eliminado!", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbolito.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Ingresa el numero del Nodo Buscado... ", "Buscando Nodo",
                                    JOptionPane.QUESTION_MESSAGE));
                            if (arbolito.buscarNodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "El Nodo no encontra en el arbol",
                                        "¡Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                System.out.println("Nodo encontrado, sus datos son: " + arbolito.buscarNodo(elemento));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                    "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbolito.estaVacio()){
                            System.out.println();
                            arbolito.inOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Aplicacion Filanizada",
                                "fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta",
                                "¡Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 5);
    }
}
