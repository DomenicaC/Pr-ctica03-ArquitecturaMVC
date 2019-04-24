/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorListSerpiente {

    private TreeMap<Integer, String> lista;
    private int codigo;

    public ControladorListSerpiente() {
        lista = new TreeMap<>();
    }
    /*
     public ControladorTreeMapSerpiente() {
     System.out.println("\n TreeMap");
     Map<Integer, String> treeMap = new TreeMap<Integer, String>();
     treeMap.put(1, "Casillas");
     treeMap.put(15, "Ramos");
     treeMap.put(3, "Pique");
     treeMap.put(5, "Puyol");
     treeMap.put(11, "Capdevila");
     treeMap.put(14, "Xabi Alonso");
     treeMap.put(16, "Busquets");
     treeMap.put(8, "Xavi Hernandez");
     treeMap.put(18, "Pedrito");
     treeMap.put(6, "Iniesta");
     treeMap.put(7, "Villa");

     // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
     Iterator it = treeMap.keySet().iterator();
     while (it.hasNext()) {
     Integer key = (Integer) it.next();
     System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
     }
     }*/

}
