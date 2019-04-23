/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Ballena;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Domenica Cañizares
 */


public class ControladorBallena {
    private List<Ballena> lista;
    private int codigo;

    public ControladorBallena() {
        lista=new ArrayList<>();
        codigo=0;
    }
    
    public void create(Ballena objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Ballena read(int codigo){
        for (Ballena ballena : lista){
            if (ballena.getCodigo() == codigo){
                return ballena;
            }
        }
        return null;
    }
    
    public void update(Ballena objeto){
        for (int i = 0; i < lista.size(); i++) {
            Ballena elemento = new Ballena();
            if(elemento.getCodigo() == objeto.getCodigo()){
                lista.set(i, elemento);
                break;
            }
            
        }
    }
    
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            Ballena elemento = lista.get(i);
            if(elemento.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }

   
            
}
