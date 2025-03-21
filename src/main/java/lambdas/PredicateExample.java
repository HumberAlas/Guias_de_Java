/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.function.BiPredicate;

public class PredicateExample {
    public static void main(String[] args) {
        // 1️⃣ Comparar dos cadenas con BiPredicate
        BiPredicate<String, String> comparar = (x, y) -> x.equalsIgnoreCase(y);

        boolean resultado1 = comparar.test("Hola", "hola");
        boolean resultado2 = comparar.test("Java", "Python");

        System.out.println("¿Son iguales? " + resultado1);
        System.out.println("¿Son iguales? " + resultado2);
    }
}
