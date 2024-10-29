package uax_practica1_moneda;

import uax_practica1_elemento_coleccionable.ElementoColeccionable;
import uax_practica1_enums.EstadoConservacionMoneda;

public class moneda extends ElementoColeccionable {
    // Atributos específicos de la clase Moneda
    private String composicion;
    private double peso;
    private double diametro;
    private double grosor;
    private EstadoConservacionMoneda estadoConservacion;

    // Constructor de la clase Moneda
    public moneda(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio, String composicion, double peso, double diametro, double grosor, EstadoConservacionMoneda estadoConservacion) {
        // Llamada al constructor de la clase padre ElementoColeccionable
        super(pais, autoridadGobernante, annus, valor, unidadMonetaria, rareza, precio);
        this.composicion = composicion;
        this.peso = peso;
        this.diametro = diametro;
        this.grosor = grosor;
        this.estadoConservacion = estadoConservacion;
    }

    // Getters y Setters

    // Obtener la composición de la moneda
    public String getComposicion() {
        return composicion;
    }

    // Establecer la composición de la moneda
    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    // Obtener el peso de la moneda
    public double getPeso() {
        return peso;
    }

    // Establecer el peso de la moneda
    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Obtener el diámetro de la moneda
    public double getDiametro() {
        return diametro;
    }

    // Establecer el diámetro de la moneda
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    // Obtener el grosor de la moneda
    public double getGrosor() {
        return grosor;
    }

    // Establecer el grosor de la moneda
    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    // Obtener el estado de conservación de la moneda
    public EstadoConservacionMoneda getEstadoConservacion() {
        return estadoConservacion;
    }

    // Establecer el estado de conservación de la moneda
    public void setEstadoConservacion(EstadoConservacionMoneda estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    // Método toString para representar el objeto Moneda como una cadena
    @Override
    public String toString() {
        return "Moneda{" +
                "pais='" + getPais() + '\'' +
                ", autoridadGobernante='" + getAutoridadGobernante() + '\'' +
                ", annus=" + getAnnus() +
                ", valor=" + getValor() +
                ", unidadMonetaria='" + getUnidadMonetaria() + '\'' +
                ", rareza=" + getRareza() +
                ", precio=" + getPrecio() +
                ", composicion='" + composicion + '\'' +
                ", peso=" + peso +
                ", diametro=" + diametro +
                ", grosor=" + grosor +
                ", estadoConservacion=" + estadoConservacion +
                '}';
    }
}
