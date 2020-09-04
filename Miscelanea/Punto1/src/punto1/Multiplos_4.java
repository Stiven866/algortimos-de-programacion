/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1;

import java.util.Scanner;

/**
 *
 * @author stiven
 */
public class Multiplos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int N, numPair;
        
        
        do{
            System.out.print("Ingrese el valor de N mayor que 4: ");
            N = input.nextInt();
        }while(N<4);
        System.out.println("Los multiplos de entre (4 y " + N + ") son: ");
        for (int i=1; i<N/4; i++){
            numPair = 4 *(i+1);
            System.out.print(numPair+ ", ");
        }
        System.out.println("");
    }
    }
    

