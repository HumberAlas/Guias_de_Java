/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Predicate;

public class PredicateEjemplo {
    public static void main(String[] args) {
        // Predicate que verifica si un número es mayor que 10
        Predicate<Integer> esMayorQue10 = n -> n > 10;

        // Verificación
        System.out.println("¿15 es mayor que 10? " + esMayorQue10.test(15)); // true
        System.out.println("¿5 es mayor que 10? " + esMayorQue10.test(5)); // false

        // Uso de and() para combinar condiciones
        Predicate<Integer> esMenorQue20 = n -> n < 20;
        Predicate<Integer> entre10y20 = esMayorQue10.and(esMenorQue20);
        System.out.println("¿15 está entre 10 y 20? " + entre10y20.test(15)); // true
    }
}
