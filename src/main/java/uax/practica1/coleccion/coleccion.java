package uax.practica1.coleccion;

import uax.practica1.elemento_coleccionable.ElementoColeccionable;
import uax.practica1.moneda.moneda;
import uax.practica1.sello.sello;
import java.util.ArrayList;
import java.util.List;

public class coleccion {
    // Lista para almacenar los elementos coleccionables
    private List<ElementoColeccionable> elementos;

    // Constructor que inicializa la lista de elementos
    public coleccion() {
        this.elementos = new ArrayList<>();
    }

    // Método para añadir una moneda a la colección
    public void anadirMoneda(moneda moneda) {
        elementos.add(moneda);
    }

    // Método para añadir un sello a la colección
    public void anadirSello(sello sello) {
        elementos.add(sello);
    }

    // Método para mostrar todas las monedas en la colección
    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof moneda) {
                System.out.println(elemento);
            }
        }
    }

    // Método para mostrar todos los sellos en la colección
    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof sello) {
                System.out.println(elemento);
            }
        }
    }

    // Método para obtener el precio total de todos los elementos en la colección
    public double obtenerPrecioTotal() {
        double total = 0;
        for (ElementoColeccionable elemento : elementos) {
            total += elemento.getPrecio();
        }
        return total;
    }

    // Método para obtener la rareza media de todos los elementos en la colección
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
