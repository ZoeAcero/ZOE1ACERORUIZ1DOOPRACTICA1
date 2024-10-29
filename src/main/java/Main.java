import java.util.InputMismatchException;
import java.util.Scanner;
import Coleccion.coleccion;
import Moneda.moneda;
import Sello.sello;
import Enums.EstadoConservacionMoneda;
import Enums.EstadoConservacionSello;

public class Main {
    public static void main(String[] args) {
        coleccion coleccion = new coleccion();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

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

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        // Código para añadir una nueva moneda
                        break;
                    case 2:
                        // Código para añadir un nuevo sello
                        break;
                    case 3:
                        coleccion.mostrarMonedas();
                        break;
                    case 4:
                        coleccion.mostrarSellos();
                        break;
                    case 5:
                        System.out.println("Precio total de la colección: " + coleccion.obtenerPrecioTotal());
                        break;
                    case 6:
                        System.out.println("Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        throw new IllegalArgumentException("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Clear the invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 0);

        scanner.close();
    }
}