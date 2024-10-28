import java.util.Scanner;
import Coleccion.coleccion;
import Moneda.moneda;
import Sello.sello;
import Enums.EstadoConservacionMoneda;
import Enums.EstadoConservacionSello;
import java.util.InputMismatchException;

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
            scanner.nextLine(); // Consume the newline

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese el país: ");
                        String paisMoneda = scanner.nextLine();
                        System.out.print("Ingrese la autoridad gobernante: ");
                        String autoridadGobernanteMoneda = scanner.nextLine();
                        System.out.print("Ingrese el año: ");
                        int annusMoneda = scanner.nextInt();
                        System.out.print("Ingrese el valor: ");
                        double valorMoneda = scanner.nextDouble();
                        System.out.print("Ingrese la unidad monetaria: ");
                        String unidadMonetariaMoneda = scanner.next();
                        System.out.print("Ingrese la rareza (1-100): ");
                        int rarezaMoneda = scanner.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precioMoneda = scanner.nextDouble();
                        System.out.print("Ingrese la composición: ");
                        String composicionMoneda = scanner.next();
                        System.out.print("Ingrese el peso (e.g., 5kg): ");
                        String pesoMonedaStr = scanner.next();
                        double pesoMoneda = Double.parseDouble(pesoMonedaStr.replaceAll("[^\\d.]", ""));
                        System.out.print("Ingrese el diámetro: ");
                        double diametroMoneda = scanner.nextDouble();
                        System.out.print("Ingrese el grosor: ");
                        double grosorMoneda = scanner.nextDouble();
                        System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                        String estadoConservacionMonedaStr = scanner.next();
                        EstadoConservacionMoneda estadoConservacionMoneda = EstadoConservacionMoneda.valueOf(estadoConservacionMonedaStr);

                        moneda nuevaMoneda = new moneda(paisMoneda, autoridadGobernanteMoneda, annusMoneda, valorMoneda, unidadMonetariaMoneda, rarezaMoneda, precioMoneda, composicionMoneda, pesoMoneda, diametroMoneda, grosorMoneda, estadoConservacionMoneda);
                        coleccion.anadirMoneda(nuevaMoneda);
                        System.out.println("Moneda añadida con éxito.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada inválida. Por favor, ingrese los datos correctamente.");
                        scanner.next(); // Clear the invalid input
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Ingrese el país: ");
                        String paisSello = scanner.nextLine();
                        System.out.print("Ingrese la autoridad gobernante: ");
                        String autoridadGobernanteSello = scanner.nextLine();
                        System.out.print("Ingrese el año: ");
                        int annusSello = scanner.nextInt();
                        System.out.print("Ingrese el valor: ");
                        double valorSello = scanner.nextDouble();
                        System.out.print("Ingrese la unidad monetaria: ");
                        String unidadMonetariaSello = scanner.next();
                        System.out.print("Ingrese la rareza (1-100): ");
                        int rarezaSello = scanner.nextInt();
                        System.out.print("Ingrese el precio: ");
                        double precioSello = scanner.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double alturaSello = scanner.nextDouble();
                        System.out.print("Ingrese la anchura: ");
                        double anchuraSello = scanner.nextDouble();
                        System.out.print("Ingrese la imagen: ");
                        String imagenSello = scanner.next();
                        System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                        String estadoConservacionSelloStr = scanner.next();
                        EstadoConservacionSello estadoConservacionSello = EstadoConservacionSello.valueOf(estadoConservacionSelloStr);

                        sello nuevoSello = new sello(paisSello, autoridadGobernanteSello, annusSello, valorSello, unidadMonetariaSello, rarezaSello, precioSello, alturaSello, anchuraSello, imagenSello, estadoConservacionSello);
                        coleccion.anadirSello(nuevoSello);
                        System.out.println("Sello añadido con éxito.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Entrada inválida. Por favor, ingrese los datos correctamente.");
                        scanner.next();
                    }
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
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}