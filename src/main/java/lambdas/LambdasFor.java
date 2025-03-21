/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.List;

public class LambdasFor {
    public static void main(String[] args) {
        // 1️⃣ Creamos una lista de países
        List<String> paises = List.of(
                "El Salvador",
                "Guatemala", 
                "Honduras", 
                "EEUU", 
                "México"
        );

        // 2️⃣ Recorremos la lista con un bucle for tradicional
        System.out.println("Recorriendo la lista con un for clásico:");
        for (String pais : paises) {
            System.out.println(pais);
        }

        System.out.println("--------------------------------------");

        // 3️⃣ Usamos forEach() con una expresión lambda
        System.out.println("Recorriendo la lista con forEach y Lambda:");
        paises.forEach(pais -> System.out.println(pais));

        System.out.println("--------------------------------------");

        // 4️⃣ Convertimos los nombres a mayúsculas con forEach y Lambda
        System.out.println("Imprimiendo en mayúsculas con Lambda:");
        paises.forEach(pais -> System.out.println(pais.toUpperCase()));
    }
}
