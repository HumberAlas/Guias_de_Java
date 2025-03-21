/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lambdas;

/**
 *
 * @author Humber
 */
import java.util.function.Supplier;
import java.util.UUID;

public class SupplierEjemplo {
    public static void main(String[] args) {
        // Supplier que genera un mensaje
        Supplier<String> mensaje = () -> "¡Hola, mundo!";
        System.out.println(mensaje.get());

        // Supplier que genera un UUID
        Supplier<UUID> generarUUID = UUID::randomUUID;
        System.out.println("UUID generado: " + generarUUID.get());
    }
}