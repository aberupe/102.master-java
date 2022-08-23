package pkg_03_Operadores;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        // escribe tu solucion aqui
        System.out.println("Proporciona el numero 1");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero 2");
        int numero2 = Integer.parseInt(scanner.nextLine());
        var resultado = numero1 > numero2;

        if (resultado) {
            System.out.println("El numero mayor es = " + numero1);
        } else {
            System.out.println("El numero mayor es = " + numero2);

        }

        // solucion 2
        System.out.println("Proporciona el numero1:");
        int numerox = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el numero2:");
        int numeroy = Integer.parseInt(scanner.nextLine());
        System.out.println("El numero mayor es:");
        System.out.println(numerox > numeroy ? numerox : numeroy);// utilizando operadores ternarios

    }
}
