/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Ballena;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorHashMapBallena {

    private int codigo;
    private HashMap<Integer,Ballena> lista;
    public ControladorHashMapBallena() {
        lista = new HashMap<>();
        codigo=0;
    }
    
    public void create(Ballena objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.keySet();
    }
    
    public Ballena read(int codigo){
        
    }
    
    public void update(Ballena objeto){
        
    }
    
    public ControladorHashMapBallena delete(int codigo){
        
    }
    
    public Ballena print(){
        System.out.println("Lista \n");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
    }
    /*
    public ControladorHashMapBallena() {
        System.out.println("\n HashMap");
        Map<Integer, String> map = new java.util.HashMap<Integer, String>();
        map.put(1, "Casillas");
        map.put(15, "Ramos");
        map.put(3, "Pique");
        map.put(5, "Puyol");
        map.put(11, "Capdevila");
        map.put(14, "Xabi Alonso");
        map.put(16, "Busquets");
        map.put(8, "Xavi Hernandez");
        map.put(18, "Pedrito");
        map.put(6, "Iniesta");
        map.put(7, "Villa");
        

        // Imprimimos el Map con un Iterador
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

    }*/
    
    
    
}
