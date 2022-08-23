package pkg_03_Operadores;

public class IgualdadRelacionales {
    public static void main(String args[]) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = cadena == cadena2; // compara la referencia de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); // comparamos contenido de cadenas
        System.out.println("f = " + f);

        // ==================== Relacionales=============

        var g = a >= b; // mayor que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) { // operamos a modulo de 2
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        var edad = 30;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
