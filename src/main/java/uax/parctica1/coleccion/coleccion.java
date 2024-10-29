package uax.parctica1.coleccion;

import uax_practica1_elemento_coleccionable.ElementoColeccionable;
import uax_practica1_moneda.moneda;
import uax_practica1_sello.sello;
import java.util.ArrayList;
import java.util.List;

public class coleccion {
    private List<ElementoColeccionable> elementos;

    public coleccion() {
        this.elementos = new ArrayList<>();
    }

    public void anadirMoneda(moneda moneda) {
        elementos.add(moneda);
    }

    public void anadirSello(sello sello) {
        elementos.add(sello);
    }

    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof moneda) {
                System.out.println(elemento);
            }
        }
    }

    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof sello) {
                System.out.println(elemento);
            }
        }
    }

    public double obtenerPrecioTotal() {
        double total = 0;
        for (ElementoColeccionable elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

    public double obtenerRarezaMedia() {
        if (elementos.isEmpty()) {
            return 0;
        }
        double totalRareza = 0;
        for (ElementoColeccionable elemento : elementos) {
            totalRareza += elemento.getRareza();
        }
        return totalRareza / elementos.size();
    }
}
