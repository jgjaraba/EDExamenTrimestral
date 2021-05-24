/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseGJ
 */
public interface InterfazCafetera {

    void agregarCafe(int cantidad) throws Exception;

    void llenarCafetera();

    void servirTaza(int tamanoTaza) throws Exception;

    void vaciarCafetera();
    
}
