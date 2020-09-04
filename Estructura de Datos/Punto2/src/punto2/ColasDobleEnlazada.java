/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2;

import java.util.LinkedList;

/**
 *
 * @author stiven
 */
public class ColasDobleEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList queue = new LinkedList();
         
        queue.add("Persona 1");
        queue.add("Persona 2");
        queue.add("Persona 3");
        queue.add("Persona 4");
        queue.add("Persona 5");   
            
        System.out.println("Personas en Fila: " + queue);
        queue.add(3, "Colado");
        System.out.println("Se colo una persona a la Fila: " + queue);
        queue.forEach(person -> {
            System.out.println("Atendiendo a: " + person);
        });
        queue.clear();
        System.out.println("Personas en Fila: " + queue);
    }
}
