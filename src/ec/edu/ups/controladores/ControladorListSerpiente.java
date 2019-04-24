/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Serpiente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 * @since 23-April-2019
 * @version IDE 8.0.2
 * @Clase controlador List en clase hija Serpiente
 */
public class ControladorListSerpiente {

    private List<Serpiente> lista;
    private int codigo;

    public ControladorListSerpiente() {
        lista=new ArrayList<>();
        codigo=0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(Serpiente objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    //leer un objeto en la lista por medio del codigo
    public Serpiente read(int codigo){
        for (Serpiente ser : lista){
            if (ser.getCodigo() == codigo){
                return ser;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(Serpiente objeto){
        for (int i = 0; i < lista.size(); i++) {
            Serpiente elemento = new Serpiente();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Serpiente elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        System.out.println("Lista \n");
        
        for (Serpiente serp : lista) {
            System.out.println(serp.getNombre());
        }
    }

}
