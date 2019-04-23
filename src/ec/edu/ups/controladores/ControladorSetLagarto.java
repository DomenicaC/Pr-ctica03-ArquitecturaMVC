/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Ballena;
import ec.edu.ups.clases.Lagarto;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Serpiente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorSetLagarto {
    private Set<Lagarto> lista;
    private int codigo;

    public ControladorSetLagarto() {
        lista = new HashSet<>();
        codigo=0;
    }
    
    public void create(Lagarto objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
        
    }
            
    public Lagarto read(int codigo){
        for (Lagarto lag : lista) {
            if (lag.getCodigo() == codigo) {
                return lag;
            }
        }
        return null;
    }
    
    public ControladorSetLagarto update(Lagarto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
        return null;
    }
    
    public ControladorSetLagarto delete(int codigo){
        for (Lagarto lag : lista) {
            if (lag.getCodigo() == codigo){
                lista.remove(lag);
                break;
            }
        }
        return null;
    }
    
}
