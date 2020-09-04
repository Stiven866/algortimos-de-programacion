/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

/**
 *
 * @author stiven
 */
public class SumaDeCuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acum = 0;
        for(int i = 0; i<100; i++){
            acum +=Math.pow(i+1,2);
        }
        System.out.println("La suma de los cuadrados es: " + acum);
    }
    
}
