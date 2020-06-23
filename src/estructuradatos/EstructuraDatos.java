/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

import java.util.Date;
import listas.ListaSimple;
import modelos.Usuario;

/**
 *
 * @author josem
 */
public class EstructuraDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimple listaSimple = new ListaSimple();
        Usuario usuario = new Usuario("Rafael", "Morente", "rafita", "12345", new Date(1998, 10, 2));
        Usuario usuario2 = new Usuario("Paola", "Gramajo", "pao", "12345", new Date(2001, 10, 2));
        Usuario usuario3 = new Usuario("Pablo", "Morataya", "elmentiras", "12345", new Date(1998, 10, 2));

        
        listaSimple.insertar(usuario);
        listaSimple.insertar(usuario2);
        listaSimple.insertar(usuario3);
        listaSimple.mostrar(); 
        Usuario buscarUsuario = listaSimple.buscar("dasdas");
        if(buscarUsuario != null) {
            System.out.println(buscarUsuario);//mostrar ventana
        } else {
            //mostrar alerta que diga que no lo encontro
            System.out.println("Usuario no encontrado D:");
        }
        
        listaSimple.buscar2("elmentiras");
        
        if(listaSimple.autenticar("elmentiras", "12345sds")) {
            System.out.println("Usuario autenticado :D");
            //MOSTRAR MENU
        } else {
            System.out.println("Usuario o contraseña incorrectos D:");
            //MOSTRAR ALERTA
        }
        
        Usuario autenticarUsuario = listaSimple.autenticar2("elmentiras", "12345sds");
        
        if(autenticarUsuario != null) {
            System.out.println("Usuario autenticado :D");
        } else {
            System.out.println("Usuario o contraseña incorrectos D:");
        }
        
        System.out.println("==========================ELIMINAR====================");
        listaSimple.eliminar("rafita");
        listaSimple.mostrar();
        
        System.out.println("==========================ELIMINAR====================");
        listaSimple.eliminar("elmentiras");
        listaSimple.mostrar();
        
    }
    
}
