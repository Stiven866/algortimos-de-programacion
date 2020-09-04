/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6;

import java.util.Scanner;

/**
 *
 * @author stiven
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor n-simo a calcular: ");
        n = input.nextInt();
        fibonacci(n);
        System.out.println("");
    }
    
    public static void fibonacci(int n){
        long numAct = 0, numPost = 1, sum = 1;
        for (int i = 0; i < n ; i++) {
            System.out.print(numAct + " ");
            sum = numAct + numPost;
            numAct = numPost;
            numPost = sum;            
        }
    }
    
    
}
