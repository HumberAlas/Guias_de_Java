/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.UUID;

class Util {
    public static void saludar(String mensaje) {
        System.out.println(mensaje);
    }
}

class Persona {
    public void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        // 1️⃣ Referencia a un método estático con una lambda
        Runnable r1 = () -> Util.saludar("Hola desde Lambda");
        r1.run();

        // ✅ 2️⃣ Solución: Usar Consumer<String> en lugar de Runnable
        Consumer<String> r2 = Util::saludar; // Referencia directa
        r2.accept("Hola desde referencia a método");

        // 3️⃣ Referencia a un método de instancia
        Persona persona = new Persona();
        Consumer<String> c1 = nombre -> persona.saludar(nombre);
        c1.accept("Carlos");

        Consumer<String> c2 = persona::saludar; // Referencia directa
        c2.accept("Pedro");

        // 4️⃣ Referencia a un constructor
        Supplier<UUID> generarUUID = UUID::randomUUID;
        System.out.println("UUID generado: " + generarUUID.get());
    }
}

