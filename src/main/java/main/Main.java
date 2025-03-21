/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import implementations.ImplementacionDB1;
import implementations.ImplementacionDB2;
import services.InterfaceDB1;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        
        ImplementacionDB1 obj1 = new ImplementacionDB1();
        ImplementacionDB2 obj2 = new ImplementacionDB2();

        System.out.println("Clase de obj1: " + obj1.getClass().getName());
        System.out.println("Clase de obj2: " + obj2.getClass().getName());

        
        Field[] fields = ImplementacionDB2.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Nombre del campo: " + field.getName());
            System.out.println("Tipo del campo: " + field.getType());
        }

        System.out.println("\n---------------------------------\n");

        
        InterfaceDB1 temp = new InterfaceDB1() {
            @Override
            public String getAll() {
                return "Clase Anónima - Método getAll()";
            }

            @Override
            public String getById(int id) {
                return "Clase Anónima - Método getById() con ID: " + id;
            }

            @Override
            public String insert(String objeto) {
                return "Clase Anónima - Insertando: " + objeto;
            }

            @Override
            public String update(String objeto) {
                return "Clase Anónima - Actualizando: " + objeto;
            }

            @Override
            public String delete(String objeto) {
                return "Clase Anónima - Eliminando: " + objeto;
            }
        };

        
        System.out.println(temp.getAll());
        System.out.println(temp.getById(10));
        System.out.println(temp.insert("Nuevo Objeto"));
        System.out.println(temp.update("Objeto Modificado"));
        System.out.println(temp.delete("Objeto Eliminado"));
    }
}





