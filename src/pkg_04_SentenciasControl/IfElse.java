package pkg_04_SentenciasControl;

public class IfElse {
    public static void main(String args[]) {
        var condicion = true;
        if (condicion) {
            System.out.println("Condicion verdadera");

        } else {
            System.out.println("Condicion falsa");
        }

        // convertir de numero a letra

        var numero = 5;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("El numero es = " + numeroTexto);
    }
}
