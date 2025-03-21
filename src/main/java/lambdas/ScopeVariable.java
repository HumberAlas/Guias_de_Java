/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.stream.IntStream;

public class ScopeVariable {
    public static void main(String[] args) {
        int num = 10;

        final int[] numArray = {10};
        IntStream.range(1, 10).forEach(i -> numArray[0] += i);

        System.out.println("Suma total: " + numArray[0]);
    }
}