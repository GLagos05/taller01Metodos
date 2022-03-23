public class Main {
    public static void main(String[] args) {
        menuCarrito();
    }

    public static void menuCarrito() {
        int[] carrito = carritoCompras();
        int productos = productosCeldas(carrito);
        mostrasCantidades();
    }

    public static void mostrasCantidades() {
    }

    public static int productosCeldas(int[] carrito) {
        int cantidadProductos = (int)(Math.random()*15);
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = cantidadProductos;
        }
    }

    public static int[] carritoCompras() {
        int celdas = (int)(Math.random()*20);
        int[] carrito = new int[celdas];
        return carrito;
    }
}
