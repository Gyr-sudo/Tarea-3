public class ArbolInventario {

    Producto raiz;

    // Constructor
    public ArbolInventario() {
        raiz = null;
    }

    // Método público para insertar
    public void insertar(int id, String nombre) {
        Producto nuevo = new Producto(id, nombre);

        if (raiz == null) {
            raiz = nuevo;
        } else {
            insertarRecursivo(raiz, nuevo);
        }
    }

    // Método recursivo para insertar
    private void insertarRecursivo(Producto actual, Producto nuevo) {

        if (nuevo.id < actual.id) {

            if (actual.izquierdo == null) {
                actual.izquierdo = nuevo;
            } else {
                insertarRecursivo(actual.izquierdo, nuevo);
            }

        } else if (nuevo.id > actual.id) {

            if (actual.derecho == null) {
                actual.derecho = nuevo;
            } else {
                insertarRecursivo(actual.derecho, nuevo);
            }

        } else {
            System.out.println("Ya existe un producto con ese ID.");
        }
    }

    // Método público para mostrar el inventario
    public void recorridoInorden() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
        } else {
            recorridoInordenRecursivo(raiz);
        }
    }

    // Recorrido inorden recursivo
    private void recorridoInordenRecursivo(Producto actual) {

        if (actual != null) {

            recorridoInordenRecursivo(actual.izquierdo);

            System.out.println(
                "ID: " + actual.id +
                " | Nombre: " + actual.nombre
            );

            recorridoInordenRecursivo(actual.derecho);
        }
    }

    // Método público para buscar un producto
    public boolean buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    // Búsqueda recursiva
    private boolean buscarRecursivo(Producto actual, int id) {

        if (actual == null) {
            return false;
        }

        if (id == actual.id) {
            return true;
        }

        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }

        return buscarRecursivo(actual.derecho, id);
    }
}