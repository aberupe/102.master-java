/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_02_TiposPrimitivos;

import java.util.Scanner;

/**
 *
 * @author AberuSan
 */
public class TiendaLibros {
//Se solicita capturar la siguiente información de una tienda de libros:
//
//nombre (String)
//
//id (int)
//
//precio (double)
//
//envioGratuito (boolean)
//
//Tu tarea es imprimir un mensaje en el siguiente formato:
//
//Proporciona el nombre:
//Proporciona el id:
//Proporciona el precio:
//Proporciona el envio gratuito:
//<nombre> #<id>
//Precio: <simbolo><precio>
//Envio Gratuito: <envioGratuito>
//Por ejemplo:
//
//Proporciona el nombre:
//Programacion con Java
//Proporciona el id:
//1520
//Proporciona el precio:
//899
//Proporciona el envio gratuito:
//true
//Programacion con Java #1520
//Precio: $899.00
//Envio Gratuito: true
//Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
//        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
