package Coleccion;
import java.util.ArrayList;
import java.util.List;
import Elemento_Coleccionable.ElementoColeccionable;

public class coleccion {
    private List<ElementoColeccionable> elementos;

    public coleccion() {
        this.elementos = new ArrayList<>();
    }

    public void anadirMoneda(Moneda moneda) {
        elementos.add(moneda);
    }

    public void anadirSello(Sello sello) {
        elementos.add(sello);
    }

    public void mostrarMonedas() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Moneda) {
                System.out.println(elemento);
            }
        }
    }

    public void mostrarSellos() {
        for (ElementoColeccionable elemento : elementos) {
            if (elemento instanceof Sello) {
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
}
