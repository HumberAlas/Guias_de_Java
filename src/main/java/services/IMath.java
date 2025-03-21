/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

@FunctionalInterface
public interface IMath {
    Double execute(Double a, Double b);
    
    default Double suma(Double a, Double b) {
        return a + b;
    }
}
