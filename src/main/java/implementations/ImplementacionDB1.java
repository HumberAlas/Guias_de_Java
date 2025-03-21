/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementations;

import services.InterfaceDB1;
import models.Modelo2;

public class ImplementacionDB1 implements InterfaceDB1 {
    Modelo2 obj = new Modelo2();

    @Override
    public String getAll() {
        obj.setMarca("Toyota");
        obj.setEmpresa("Toyota Motors");
        return obj.toString();
    }

    @Override
    public String getById(int id) {
        return "Obteniendo marca con ID: " + id;
    }

    @Override
    public String insert(String objeto) {
        obj.setEmpresa(objeto);
        return "Insertando en la empresa: " + obj.getEmpresa();
    }

    @Override
    public String update(String objeto) {
        obj.setEmpresa(objeto);
        return "Actualizando empresa a: " + obj.getEmpresa();
    }

    @Override
    public String delete(String objeto) {
        return "Eliminando empresa con nombre: " + objeto;
    }
}

