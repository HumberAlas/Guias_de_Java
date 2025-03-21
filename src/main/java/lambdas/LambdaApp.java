/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import services.IMath;

public class LambdaApp {
    public static void main(String[] args) {
        // 1️⃣ Implementación de resta con clase anónima
        IMath resta = new IMath() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };
        System.out.println("Resta con clase anónima: " + resta.execute(10.0, 5.0));

        // 2️⃣ Implementación de multiplicación con Lambda
        IMath multiplicar = (a, b) -> a * b;
        System.out.println("Multiplicación con Lambda: " + multiplicar.execute(10.0, 5.0));

        // 3️⃣ Implementación de división con Lambda
        IMath dividir = (a, b) -> {
            return a / b;
        };
        System.out.println("División con Lambda: " + dividir.execute(10.0, 5.0));
    }
}
