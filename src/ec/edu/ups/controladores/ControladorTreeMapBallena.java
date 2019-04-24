/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Ballena;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Domenica Cañizares
 * @since 23-April-2019
 * @version IDE 8.0.2
 * @Clase controlador TreeMap en clase hija Ballena
 */
public class ControladorTreeMapBallena {

    private int codigo;
    private Map<Integer, Ballena> lista;

    public ControladorTreeMapBallena() {
        lista = new TreeMap<>();
        codigo = 0;
    }

    //crear un num=evo objeto en la lista
    public void create(Ballena objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }

    //leer un objeto en la lista por medio del codigo
    public Ballena read(int codigo) {
        if (lista.get(codigo) != null) {
            return lista.get(codigo);
        }
        return null;

    }

    //modificar un objeto en la lista por medio del codigo
    public void update(Ballena objeto) {
        lista.put(objeto.getCodigo(), objeto);
    }

    //eliminar un objeto por medio del codigo
    public void delete(int codigo) {
        lista.remove(codigo);
    }

    //imprime todos los objetos de la lista
    public void print() {
        System.out.println("Lista \n");

        for (Map.Entry<Integer, Ballena> elemento : lista.entrySet()) {
            int key = elemento.getKey();
            String nomBallena = elemento.getValue().getNombre();
            System.out.println("Key: " + key + " Ballena: " + nomBallena);
        }
    }
}
