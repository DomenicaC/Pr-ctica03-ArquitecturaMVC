/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Lagarto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 * @since 23-April-2019
 * @version IDE 8.0.2
 * @Clase controlador Set en clase hija Lagarto
 */
public class ControladorSetLagarto {
    private Set<Lagarto> lista;
    private int codigo;

    public ControladorSetLagarto() {
        lista = new HashSet<>();
        codigo=0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(Lagarto objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public Lagarto read(int codigo){
        for (Lagarto lag : lista) {
            if (lag.getCodigo() == codigo) {
                return lag;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(Lagarto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (Lagarto lag : lista) {
            if (lag.getCodigo() == codigo){
                lista.remove(lag);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (Lagarto lag : lista) {
            System.out.println(lag.getNombre());
        }
    }
    
}
