/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import modelos.Usuario;
import nodos.NodoSimple;

/**
 *
 * @author josem
 */
public class ListaSimple {
    private NodoSimple primero;

    public ListaSimple() {
    }
    
    private Boolean esVacia() {
        return primero == null;
    }
    
    public void insertar(Object object) {
        NodoSimple nuevo = new NodoSimple(object);
        if(esVacia()) {
            primero = nuevo;
        } else {
            NodoSimple aux = primero;
            while(aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    
    public void mostrar() {
        NodoSimple aux = primero;
        while(aux != null) {
            Usuario usuario = (Usuario)aux.getObject();
            System.out.println("==============================");
            System.out.println(usuario.getNombre());
            System.out.println(usuario.getApellido());
            System.out.println(usuario.getNickname());
            System.out.println(usuario.getPassword());
            System.out.println(usuario.getFechaNacimiento());
            System.out.println("==============================");
            aux = aux.getSiguiente();
        }
    }
    
}
