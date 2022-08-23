package pkg_03_Operadores;

public class Condicionales {
    public static void main(String arg[]) {
        var a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= valorMinimo && a <= valorMaximo;

        if (resultado) {
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var diaDescanso = true;
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
