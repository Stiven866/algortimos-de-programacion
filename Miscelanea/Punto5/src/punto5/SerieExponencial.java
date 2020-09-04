/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import java.util.Scanner;

/**
 *
 * @author stiven
 */
public class SerieExponencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double x;
        x = 0.0;
        int N=0;
        
        System.out.print("Ingese el valor de x: ");
        x = input.nextDouble();
        System.out.print("Ingrese el valor de N: ");
        N = input.nextInt();
        System.out.println("EL valor de la serie es: " + serie(N,x));
        System.out.println("EL valor de la serie es: " + serie(x));
    }
    
    public static double serie(int n, double x){
        double sum=0, term;
        for(int i=0; i< n; i++){
            term= Math.pow(x,i)/factorial(i);
            sum +=term;
        }
        return sum;
    }
    public static double serie(double x){
        double sum = 0, term, aux;
        int i = 0;
        
        do{
          term=Math.pow(x,i)/factorial(i);
          sum +=term;
          i++;   
          aux = Math.pow(x,i)/factorial(i);
        }while(aux > Math.pow(10,-4));
               System.out.println("Valor de N: " + i);
        return sum;
    }
    
    public static double factorial(int n){
        double fac =1;
        for (int i = 2; i <= n; i++){
            fac *=i;
        }
        return fac;
    }
    
}
