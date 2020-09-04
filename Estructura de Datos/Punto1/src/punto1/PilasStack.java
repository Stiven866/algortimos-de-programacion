/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

/**
 *
 * @author stiven
 */

import java.util.Scanner;
import java.util.Stack;
public class PilasStack {
     private static Stack stack = new Stack();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int select;
        Scanner input = new Scanner(System.in);
        String transac;
        do{
            System.out.println("1. Insertar\n2. Eliminar\n3. Salir\n");
            System.out.print("Option: ");
            select = input.nextInt();
            switch(select){
                case 1: 
                    push();
                    show();
                    break;
                case 2: 
                    pop();
                    show();
                    break;
            }
        }while(select<4);
    }
    
    public static void pop(){
        System.out.println(stack.peek() + " Eliminado...");
        stack.pop();
    }
    
    public static void push(){
        Scanner input = new Scanner(System.in);
        System.out.print("Elemento: ");
        stack.push(input.nextLine());
    }
    
    public static void show(){
        if(!stack.empty()){
            stack.forEach(element -> {
                System.out.println("\t\t\t\t" + element);
            });
        }
    }
    
}
