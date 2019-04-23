/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Lagarto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorLagarto {

    private List<Lagarto> lista;

    public ControladorLagarto() {
        lista = new ArrayList<>();
    }

    public void create(Lagarto objeto) {
        lista.add(objeto);
    }

    public Lagarto read(int codigo) {
        for (Lagarto ballena : lista) {
            if (ballena.getCodigo() == codigo) {
                return ballena;
            }
        }
        return null;
    }

    public void update(Lagarto objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Lagarto elemento = new Lagarto();
            if (elemento.getCodigo() == objeto.getCodigo()) {
                lista.set(i, elemento);
                break;
            }

        }
    }

    public void delete(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            Lagarto elemento = lista.get(i);
            if (elemento.getCodigo() == codigo) {
                lista.remove(i);
                break;
            }
        }
    }

   
}
