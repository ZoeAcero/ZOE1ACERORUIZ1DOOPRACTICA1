package Elemento_Coleccionable;

public class ElementoColeccionable {
    private String pais;
    private String autoridadGobernante;
    private int annus;
    private double valor;
    private String unidadMonetaria;
    private int rareza;
    private double precio;

    public ElementoColeccionable(String pais, String autoridadGobernante, int annus, double valor, String unidadMonetaria, int rareza, double precio) {
        if (rareza < 1 || rareza > 100) {
            throw new IllegalArgumentException("El índice de rareza debe estar entre 1 y 100.");
        }
        this.pais = pais;
        this.autoridadGobernante = autoridadGobernante;
        this.annus = annus;
        this.valor = valor;
        this.unidadMonetaria = unidadMonetaria;
        this.rareza = rareza;
        this.precio = precio;
    }
}
