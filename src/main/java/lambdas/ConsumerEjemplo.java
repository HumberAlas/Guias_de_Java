/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.function.Consumer;
import java.util.function.BiConsumer;

public class ConsumerEjemplo {
    public static void main(String[] args) {
        // Consumer que imprime un mensaje
        Consumer<String> imprimirMensaje = mensaje -> System.out.println("Mensaje: " + mensaje);
        imprimirMensaje.accept("Hola, mundo!");

        // BiConsumer que suma dos números e imprime el resultado
        BiConsumer<Integer, Integer> sumar = (a, b) -> System.out.println("Suma: " + (a + b));
        sumar.accept(10, 20);
    }
}