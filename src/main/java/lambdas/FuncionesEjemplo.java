/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.function.Function;

public class FuncionesEjemplo {
    
    // Función que multiplica por 10
    static Function<Integer, Integer> multiplicar = n -> n * 10;
    
    // Función que suma 10
    static Function<Integer, Integer> sumar = n -> n + 10;
    
    // Usando andThen: Primero multiplica, luego suma
    static Function<Integer, Integer> usoAndThen = multiplicar.andThen(sumar);
    
    // Usando compose: Primero suma, luego multiplica
    static Function<Integer, Integer> usoCompose = multiplicar.compose(sumar);
    
    public static void main(String[] args) {
        System.out.println("Multiplicar 10: " + multiplicar.apply(10)); // 100
        System.out.println("Sumar 10: " + sumar.apply(10)); // 20
        System.out.println("Uso de andThen (3 * 10 + 10): " + usoAndThen.apply(3)); // 40
        System.out.println("Uso de compose ((3 + 10) * 10): " + usoCompose.apply(3)); // 130
    }
}