/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.function.UnaryOperator;

public class UnaryOperatorEjemplo {
    public static void main(String[] args) {
        // Operación que multiplica por 2
        UnaryOperator<Integer> duplicar = n -> n * 2;
        System.out.println("Duplicar 5: " + duplicar.apply(5)); // 10
    }
}