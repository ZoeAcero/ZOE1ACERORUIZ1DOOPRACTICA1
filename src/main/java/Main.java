import java.util.Scanner;
import Coleccion.coleccion;
import Moneda.moneda;
import Sello.sello;
import Elemento_Coleccionable.ElementoColeccionable;
import Enums.*;

public class Main {
    public static void main(String[] args) {
        coleccion coleccion = new coleccion();
        Scanner scanner = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("Menú:");
            System.out.println("1-Añadir una nueva moneda");
            System.out.println("2-Añadir un nuevo sello");
            System.out.println("3-Mostrar todas las monedas");
            System.out.println("4-Mostrar todos los sellos");
            System.out.println("5-Mostrar el precio total de la colección");
            System.out.println("6-Mostrar la rareza media de la colección");
            System.out.println("0-Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
}
