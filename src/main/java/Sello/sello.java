package Sello;
import Elemento_Coleccionable.ElementoColeccionable;
import Enums.EstadoConservacionSello;

public class sello extends ElementoColeccionable{

    private double altura;
    private double anchura;
    private String imagen;
    private EstadoConservacionSello estadoConservacion;

    public sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, String imagen, EstadoConservacionSello estadoConservacion) {
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }

    // Getters y Setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
