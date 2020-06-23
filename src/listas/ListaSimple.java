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
            System.out.println(usuario);
            System.out.println("==============================");
            aux = aux.getSiguiente();
        }
    }
    
    //APROBADO POR RAFITA :3
    public Usuario buscar(String nickname) {
        NodoSimple aux = primero;
        while(aux != null) {
            Usuario usuario = (Usuario)aux.getObject();
            if(usuario.getNickname().equals(nickname)) {
                return usuario;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    
    //BUSCAR NEL :v
    public void buscar2(String nickname) {
        NodoSimple aux = primero;
        while(aux != null) {
            Usuario usuario = (Usuario)aux.getObject();
            if(usuario.getNickname().equals(nickname)) {
                System.out.println(usuario);
                return;
            } else {
                aux = aux.getSiguiente();
            }
        }
        System.out.println("USUARIO NO ENCONTRADO :(");
    }
    
    public boolean autenticar(String nickname, String password) {
        NodoSimple aux = primero;
        while(aux != null) {
            Usuario usuario = (Usuario)aux.getObject();
            if(usuario.getNickname().equals(nickname) && usuario.getPassword().equals(password)) {
                return true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return false;
    }
    
    public Usuario autenticar2(String nickname, String password) {
        NodoSimple aux = primero;
        while(aux != null) {
            Usuario usuario = (Usuario)aux.getObject();
            if(usuario.getNickname().equals(nickname) && usuario.getPassword().equals(password)) {
                return usuario;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    
    public void eliminar(String nickname) {
        if(buscar(nickname) != null) {
            Usuario usuario = (Usuario)primero.getObject();
            if(usuario.getNickname().equals(nickname)) {
                primero = primero.getSiguiente();
            } else {
                NodoSimple aux = primero;
                Usuario auxU = (Usuario)aux.getSiguiente().getObject();
                while(!auxU.getNickname().equals(nickname)) {
                    aux = aux.getSiguiente(); 
                    auxU = (Usuario)aux.getSiguiente().getSiguiente().getObject();
                }
                NodoSimple siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
        }
    }
    
    
    
}
