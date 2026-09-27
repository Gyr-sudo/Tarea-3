import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArbolInventario inventario = new ArbolInventario();

        int opcion;

        do {

            System.out.println("\n==============================");
            System.out.println("       TREE-STOCK");
            System.out.println("==============================");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n--- REGISTRAR PRODUCTO ---");

                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    inventario.insertar(id, nombre);

                    System.out.println("Producto registrado correctamente.");

                    break;

                case 2:

                    System.out.println("\n--- INVENTARIO ---");

                    inventario.recorridoInorden();

                    break;

                case 3:

                    System.out.println("\n--- BUSCAR PRODUCTO ---");

                    System.out.print("Ingrese el ID que desea buscar: ");
                    int idBuscar = scanner.nextInt();

                    if (inventario.buscar(idBuscar)) {
                        System.out.println("El producto con ID "
                                + idBuscar + " SI existe.");
                    } else {
                        System.out.println("El producto con ID "
                                + idBuscar + " NO existe.");
                    }

                    break;

                case 0:

                    System.out.println("\nPrograma finalizado.");
                    break;

                default:

                    System.out.println("\nOpción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}