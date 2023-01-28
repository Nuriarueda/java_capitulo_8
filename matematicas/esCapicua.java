package matematicas;

import java.util.Scanner;
public class esCapicua {
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduzca un número entero y te dire si es capicua o no: ");
        int x = sc.nextInt();
        if (esCapicua(x)) {
            System.out.println("El " + x + " es capicua.");
        } else {
            System.out.println("El " + x + " no es capicua.");
        }
        sc.close();

        
    }
    public static boolean esCapicua(int x) {
        return esCapicua((int)x);
    }
}
