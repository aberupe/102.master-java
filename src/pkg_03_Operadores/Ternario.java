package pkg_03_Operadores;

public class Ternario {
    public static void main(String arg[]) {
        var resultado = (3 > 2) ? "verdadero" : "falso";// operacion booleana true or false
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("Resultado = " + resultado);
    }
}
