package pkg_04_SentenciasControl;

import java.util.Scanner;

public class EstacionAno {
    public static void main(String args[]) {
        // var mes = 9;
        // ingresar el valor de manera dinamica y convertir a entero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero de mes");
        int mes = Integer.parseInt(scanner.nextLine());

        var estacion = "Estacion desconocida";

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        System.out.println("Estacion = " + estacion);
    }
}
