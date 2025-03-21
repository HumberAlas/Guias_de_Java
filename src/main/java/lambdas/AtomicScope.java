/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicScope {
    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(10);

        // ✅ Ahora sí podemos modificar el valor dentro de la lambda
        IntStream.range(1, 10).forEach(i -> num.addAndGet(i));

        System.out.println("Suma total con AtomicInteger: " + num.get());
    }
}
