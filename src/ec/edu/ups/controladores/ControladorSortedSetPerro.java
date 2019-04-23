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
 */
public class ControladorSortedSetPerro {
    private SortedSet<Perro> lista;
    private int codigo;

    public ControladorSortedSetPerro() {
        lista = new TreeSet<>();
        codigo=0;
    }
    
    public void create(Perro objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
        
    }
            
    public Perro read(int codigo){
        for (Perro per : lista) {
            if (per.getCodigo() == codigo) {
                return per;
            }
        }
        return null;
    }
    
    public Perro update(Perro objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
        return null;
    }
    
    public Perro delete(int codigo){
        for (Perro per : lista) {
            if (per.getCodigo() == codigo){
                lista.remove(per);
                break;
            }
        }
        return null;
    }
    
    public Perro print(){
        System.out.println("Lista \n");
        for (Perro per : lista) {
            System.out.println(per);
        }
        return null;
    }

}
