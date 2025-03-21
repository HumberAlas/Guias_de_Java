/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import services.IPrinter;
import models.Modelo1;
import models.Modelo2;

public class LambdaGenerics {
    public static void main(String[] args) {
        // 1️⃣ Imprimir una cadena con una lambda
        IPrinter<String> imprimirTexto = (objeto) -> System.out.println("Texto: " + objeto);
        imprimirTexto.print("Lambda para imprimir texto");

        // 2️⃣ Imprimir un número con una lambda
        IPrinter<Integer> imprimirNumero = (objeto) -> System.out.println("Número: " + objeto);
        imprimirNumero.print(100);

        // 3️⃣ Imprimir un objeto Modelo1
        Modelo1 modelo1 = new Modelo1();
        modelo1.setNombre("Cliente A");
        modelo1.setDireccion("Ciudad X");

        IPrinter<Modelo1> imprimirModelo1 = (objeto) -> System.out.println("Modelo1: " + objeto);
        imprimirModelo1.print(modelo1);

        // 4️⃣ Imprimir un objeto Modelo2
        Modelo2 modelo2 = new Modelo2();
        modelo2.setEmpresa("Empresa XYZ");
        modelo2.setMarca("Toyota");

        IPrinter<Modelo2> imprimirModelo2 = (objeto) -> System.out.println("Modelo2: " + objeto);
        imprimirModelo2.print(modelo2);
    }
}
