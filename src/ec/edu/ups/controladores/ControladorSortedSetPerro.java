/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Perro;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Domenica Cañizares
 * @since 23-April-2019
 * @version IDE 8.0.2
 * @Clase controlador SortedSet en clase hija Perro
 */
public class ControladorSortedSetPerro {
    private SortedSet<Perro> lista;
    private int codigo;

    public ControladorSortedSetPerro() {
        lista = new TreeSet<>();
        codigo=0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(Perro objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
        
    }
            
    //leer un objeto en la lista por medio del codigo
    public Perro read(int codigo){
        for (Perro per : lista) {
            if (per.getCodigo() == codigo) {
                return per;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(Perro objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (Perro per : lista) {
            if (per.getCodigo() == codigo){
                lista.remove(per);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        System.out.println("Lista \n");
        
        for (Perro per : lista) {
            System.out.println(per.getNombre());
        }
    }

}
