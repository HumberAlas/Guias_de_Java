/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementations;

import services.ServicesDB2;
import models.Modelo1;

public class ImplementacionDB2 implements ServicesDB2 {
    Modelo1 obj = new Modelo1();

    @Override
    public String getAll() {
        obj.setNombre("Cliente 1");
        obj.setDireccion("Av. Principal 123");
        return obj.toString();
    }

    @Override
    public String getById(int id) {
        return "Obteniendo dirección con ID: " + id;
    }

    @Override
    public String insert(String objeto) {
        obj.setNombre(objeto);
        return "Insertando nuevo nombre: " + obj.getNombre();
    }

    @Override
    public String update(String objeto) {
        obj.setNombre(objeto);
        return "Actualizando nombre a: " + obj.getNombre();
    }

    @Override
    public String delete(String objeto) {
        return "Eliminando nombre: " + objeto;
    }
}

