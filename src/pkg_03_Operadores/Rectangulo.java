package pkg_03_Operadores;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        // escribe tu solucion aqui
        System.out.println("Proporciona el alto");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho");
        int ancho = Integer.parseInt(scanner.nextLine());
        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
