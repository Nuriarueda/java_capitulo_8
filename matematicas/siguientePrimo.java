package matematicas;

public class siguientePrimo {

    public static void main(String[] args) {
        System.out.print("Introduzca un número entero positivo: ");
        int n;
        if (esPrimo(n)) {
            System.out.println("El " + n + " es primo.");
        } else {
            System.out.println("El " + n + " no es primo.");
        }
    }
    public static int siguientePrimo(int x) {
        while (!esPrimo(++x)) {};
    
        return x;
    }

}
