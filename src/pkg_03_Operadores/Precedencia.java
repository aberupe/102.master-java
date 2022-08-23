package pkg_03_Operadores;

public class Precedencia {
    public static void main(String arg[]) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 / 3; // operacion de multiplicacion y division tiene la misma prioridad
        // 4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);

    }
}
