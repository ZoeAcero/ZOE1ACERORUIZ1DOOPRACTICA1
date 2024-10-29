package uax.practica1.sello;

import uax.practica1.elemento_coleccionable.ElementoColeccionable;
import uax.practica1.enums.EstadoConservacionSello;

public class sello extends ElementoColeccionable {

    // Atributos específicos de la clase Sello
    private double altura;
    private double anchura;
    private String imagen;
    private EstadoConservacionSello estadoConservacion;

    // Constructor de la clase Sello
    public sello(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, double altura, double anchura, String imagen, EstadoConservacionSello estadoConservacion) {
        // Llamada al constructor de la clase padre ElementoColeccionable
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.altura = altura;
        this.anchura = anchura;
        this.imagen = imagen;
        this.estadoConservacion = estadoConservacion;
    }

    // Getters y Setters

    // Obtener la altura del sello
    public double getAltura() {
        return altura;
    }

    // Establecer la altura del sello
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Obtener la anchura del sello
    public double getAnchura() {
        return anchura;
    }

    // Establecer la anchura del sello
    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    // Obtener la imagen del sello
    public String getImagen() {
        return imagen;
    }

    // Establecer la imagen del sello
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    // Obtener el estado de conservación del sello
    public EstadoConservacionSello getEstadoConservacion() {
        return estadoConservacion;
    }

    // Establecer el estado de conservación del sello
    public void setEstadoConservacion(EstadoConservacionSello estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    // Método toString para representar el objeto Sello como una cadena
    @Override
    public String toString() {
        return "Sello{" +
                "pais='" + getPais() + '\'' +
                ", autoridadGobernante='" + getAutoridadGobernante() + '\'' +
                ", annus=" + getAnnus() +
                ", valor=" + getValor() +
                ", unidadMonetaria='" + getUnidadMonetaria() + '\'' +
                ", rareza=" + getRareza() +
                ", precio=" + getPrecio() +
                ", altura=" + altura +
                ", anchura=" + anchura +
                ", imagen='" + imagen + '\'' +
                ", estadoConservacion=" + estadoConservacion +
                '}';
    }
}
