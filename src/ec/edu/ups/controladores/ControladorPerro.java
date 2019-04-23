/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Perro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorPerro {
    private List<Perro> lista;

    public ControladorPerro() {
        lista=new ArrayList<>();
    }
    
    public void create(Perro objeto){
        lista.add(objeto);
    }
    
    public Perro read(int codigo){
        for (Perro ballena : lista){
            if (ballena.getCodigo() == codigo){
                return ballena;
            }
        }
        return null;
    }
    
    public void update(Perro objeto){
        for (int i = 0; i < lista.size(); i++) {
            Perro elemento = new Perro();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Perro elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
}
