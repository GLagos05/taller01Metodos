public class Main {
    public static void main(String[] args) {
        menuCarrito();
    }

    public static void menuCarrito() {
        int[] carrito = carritoCompras();
        carrito = productosCeldas(carrito);
        int sumaCarrito = sumatoria(carrito);
        mostrarProductos(sumaCarrito);
        int[] compras = preciosCelda(carrito);
        compras = precioCarrito(compras,carrito);
        mostrarPreciosCelda(compras,carrito);
        int sumaCompras = sumatoria(compras);
        mostrarPrecioTotal(sumaCompras);
    }

    public static int[] carritoCompras() {
        int celdas = (int)(Math.random()*20);
        return new int[celdas];
    }

    public static int[] productosCeldas(int[] carrito) {
        for (int i = 0; i < carrito.length; i++) {
            int cantidadProductos = (int)(Math.random()*15);
            carrito[i] = cantidadProductos;
        }
        return carrito;
    }

    public static int[] preciosCelda(int[] carrito) {
        int[] compras = new int[carrito.length];
        compras[0] = 500;
        for (int i = 1; i < carrito.length; i++) {
            compras[i] = carrito[i-1]+ 150;
        }
        return compras;
    }

    public static int[] precioCarrito(int[] compras, int[] carrito) {
        for (int i = 0; i < carrito.length; i++) {
            compras[i] *= carrito[i];
        }
        return compras;
    }

    public static int sumatoria(int[] arreglo) {
        int sumatoria = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumatoria += arreglo[i];
        }
        return sumatoria;
    }

    public static void mostrarProductos(int sumaCarrito) {
        System.out.println("El carrito contiene"+sumaCarrito+"productos");
    }

    public static void mostrarPreciosCelda(int[] compras, int[] carrito) {
        for (int i = 0; i < compras.length; i++) {
            System.out.println("Cantidad producto ["+i+"]: "+carrito[i]+", Subtotal: $"+compras[i]);
        }
    }

    public static void mostrarPrecioTotal(int sumaCompras) {
        System.out.println("Total de compra: $"+sumaCompras);
    }

}
