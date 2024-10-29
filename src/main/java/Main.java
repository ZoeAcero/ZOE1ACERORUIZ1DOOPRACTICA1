import java.util.Scanner;
import uax_parctica1_coleccion.coleccion;
import uax_practica1_moneda.moneda;
import uax_practica1_sello.sello;
import uax_practica1_enums.EstadoConservacionMoneda;
import uax_practica1_enums.EstadoConservacionSello;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva colección
        coleccion coleccion = new coleccion();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            // Mostrar el menú
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
                // Leer la opción del usuario
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        // Añadir una nueva moneda
                        try {
                            System.out.print("Ingrese el país: ");
                            String paisMoneda = scanner.nextLine();
                            System.out.print("Ingrese la autoridad gobernante: ");
                            String autoridadGobernanteMoneda = scanner.nextLine();
                            System.out.print("Ingrese el año: ");
                            int annusMoneda = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el valor (e.g., 10€): ");
                            String valorMonedaStr = scanner.nextLine();
                            double valorMoneda = Double.parseDouble(valorMonedaStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese la unidad monetaria: ");
                            String unidadMonetariaMoneda = scanner.nextLine();
                            System.out.print("Ingrese la rareza (1-100): ");
                            int rarezaMoneda = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el precio (e.g., 10€): ");
                            String precioMonedaStr = scanner.nextLine();
                            double precioMoneda = Double.parseDouble(precioMonedaStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese la composición: ");
                            String composicionMoneda = scanner.nextLine();
                            System.out.print("Ingrese el peso (e.g., 5kg): ");
                            String pesoMonedaStr = scanner.nextLine();
                            double pesoMoneda = Double.parseDouble(pesoMonedaStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese el diámetro (e.g., 10cm): ");
                            String diametroMonedaStr = scanner.nextLine();
                            double diametroMoneda = Double.parseDouble(diametroMonedaStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese el grosor (e.g., 2mm): ");
                            String grosorMonedaStr = scanner.nextLine();
                            double grosorMoneda = Double.parseDouble(grosorMonedaStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese el estado de conservación (G, VG, F, VF, XF, AU, UNC): ");
                            String estadoConservacionMonedaStr = scanner.nextLine();
                            EstadoConservacionMoneda estadoConservacionMoneda = EstadoConservacionMoneda.valueOf(estadoConservacionMonedaStr);

                            // Crear y añadir la nueva moneda a la colección
                            moneda nuevaMoneda = new moneda(paisMoneda, autoridadGobernanteMoneda, annusMoneda, valorMoneda, unidadMonetariaMoneda, rarezaMoneda, precioMoneda, composicionMoneda, pesoMoneda, diametroMoneda, grosorMoneda, estadoConservacionMoneda);
                            coleccion.anadirMoneda(nuevaMoneda);
                            System.out.println("Moneda añadida con éxito.");
                        } catch (InputMismatchException | NumberFormatException e) {
                            System.out.println("Error: Entrada inválida. Por favor, ingrese los datos correctamente.");
                        }
                        break;
                    case 2:
                        // Añadir un nuevo sello
                        try {
                            System.out.print("Ingrese el país: ");
                            String paisSello = scanner.nextLine();
                            System.out.print("Ingrese la autoridad gobernante: ");
                            String autoridadGobernanteSello = scanner.nextLine();
                            System.out.print("Ingrese el año: ");
                            int annusSello = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el valor (e.g., 10€): ");
                            String valorSelloStr = scanner.nextLine();
                            double valorSello = Double.parseDouble(valorSelloStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese la unidad monetaria: ");
                            String unidadMonetariaSello = scanner.nextLine();
                            System.out.print("Ingrese la rareza (1-100): ");
                            int rarezaSello = Integer.parseInt(scanner.nextLine());
                            System.out.print("Ingrese el precio (e.g., 10€): ");
                            String precioSelloStr = scanner.nextLine();
                            double precioSello = Double.parseDouble(precioSelloStr.replaceAll("[^\\d.]", ""));
                            System.out.print("Ingrese la altura: ");
                            double alturaSello = Double.parseDouble(scanner.nextLine());
                            System.out.print("Ingrese la anchura: ");
                            double anchuraSello = Double.parseDouble(scanner.nextLine());
                            System.out.print("Ingrese la imagen: ");
                            String imagenSello = scanner.nextLine();
                            System.out.print("Ingrese el estado de conservación (U, NSG, NF, N): ");
                            String estadoConservacionSelloStr = scanner.nextLine();
                            EstadoConservacionSello estadoConservacionSello = EstadoConservacionSello.valueOf(estadoConservacionSelloStr);

                            // Crear y añadir el nuevo sello a la colección
                            sello nuevoSello = new sello(paisSello, autoridadGobernanteSello, annusSello, valorSello, unidadMonetariaSello, rarezaSello, precioSello, alturaSello, anchuraSello, imagenSello, estadoConservacionSello);
                            coleccion.anadirSello(nuevoSello);
                            System.out.println("Sello añadido con éxito.");
                        } catch (InputMismatchException | NumberFormatException e) {
                            System.out.println("Error: Entrada inválida. Por favor, ingrese los datos correctamente.");
                        }
                        break;
                    case 3:
                        // Mostrar todas las monedas
                        coleccion.mostrarMonedas();
                        break;
                    case 4:
                        // Mostrar todos los sellos
                        coleccion.mostrarSellos();
                        break;
                    case 5:
                        // Mostrar el precio total de la colección
                        System.out.println("Precio total de la colección: " + coleccion.obtenerPrecioTotal());
                        break;
                    case 6:
                        // Mostrar la rareza media de la colección
                        System.out.println("Rareza media de la colección: " + coleccion.obtenerRarezaMedia());
                        break;
                    case 0:
                        // Salir del programa
                        System.out.println("Saliendo...");
                        break;
                    default:
                        // Manejar opción no válida
                        throw new IllegalArgumentException("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                // Manejar entrada inválida
                System.out.println("Error: Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar la entrada inválida
            } catch (IllegalArgumentException e) {
                // Mostrar mensaje de error para opción no válida
                System.out.println(e.getMessage());
            }
        } while (opcion != 0);

        // Cerrar el escáner
        scanner.close();
    }
}