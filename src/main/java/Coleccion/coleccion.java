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
}
