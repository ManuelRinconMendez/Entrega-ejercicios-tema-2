import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio;
        double iva;
        double total;

        Scanner leer = new Scanner(System.in);
        CalculaIva calculador = new CalculaIva();
        System.out.println("Ingrese el precio:");
        precio = leer.nextDouble();

        System.out.println("Ingrese porcentaje de iva:");
        iva = leer.nextDouble();
        iva = calculador.obtenerIva(precio, iva);
        total = precio + iva;

        System.out.println("Precio: " + precio);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);

    }
}
