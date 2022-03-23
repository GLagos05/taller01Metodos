public class Main {
    public static void main(String[] args) {
        menuCarrito();
    }

    public static void menuCarrito() {
        int[] carrito = carritoCompras();
        carrito = productosCeldas(carrito);
        int sumaCarrito = sumatoriaProductos(carrito);
        mostrasCantidades(sumaCarrito);
    }

    public static int sumatoriaProductos(int[] carrito) {
        int sumatoria = 0;
        for (int i = 0; i < carrito.length; i++) {
            sumatoria += carrito[i];
        }
        return sumatoria;
    }

    public static void mostrasCantidades(int sumaCarrito) {
        System.out.println("El carrito contiene"+sumaCarrito+"productos");
    }

    public static int[] productosCeldas(int[] carrito) {
        for (int i = 0; i < carrito.length; i++) {
            int cantidadProductos = (int)(Math.random()*15);
            carrito[i] = cantidadProductos;
        }
        return carrito;
    }

    public static int[] carritoCompras() {
        int celdas = (int)(Math.random()*20);
        int[] carrito = new int[celdas];
        return carrito;
    }
}
