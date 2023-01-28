package matematicas;

import java.util.Scanner;
public class esPrimo {
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduzca un número entero y te dire si es un numero primo o no: ");
        int x = sc.nextInt();
        if (esPrimo(x)) {
            System.out.println("El " + x + " es primo.");
        } else {
            System.out.println("El " + x + " no es primo.");
        }
        sc.close(); 
    }
    
    public static Boolean esPrimo(long n) {
        if (n < 2) {
          return false;
        } else {
          for (long i = n / 2; i >= 2; i--) {
            if (n % i == 0) {
              return false;
            }
          }
        }
        return true;
      }

}
